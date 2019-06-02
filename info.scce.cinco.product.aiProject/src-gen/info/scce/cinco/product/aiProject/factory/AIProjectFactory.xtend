package info.scce.cinco.product.aiProject.factory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

import info.scce.cinco.product.aiProject.aiproject.AiprojectPackage
import info.scce.cinco.product.aiProject.aiproject.impl.AIProjectImpl
import info.scce.cinco.product.aiProject.aiproject.impl.AiprojectFactoryImpl
import info.scce.cinco.product.aiProject.aiproject.internal.InternalFactory
import info.scce.cinco.product.aiProject.aiproject.internal.InternalPackage

import info.scce.cinco.product.aiProject.aiproject.adapter.*

import graphmodel.internal.InternalModelElement
import graphmodel.internal.InternalModelElementContainer
import graphmodel.internal.InternalGraphModel
import graphmodel.internal.InternalContainer
import graphmodel.internal.InternalNode
import graphmodel.internal.InternalEdge
import graphmodel.internal.InternalType
import graphmodel.internal.InternalIdentifiableElement
import graphmodel.ModelElement
import graphmodel.IdentifiableElement
import graphmodel.GraphModel
import graphmodel.Type

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.plugin.EcorePlugin

class AIProjectFactory extends AiprojectFactoryImpl {
	
	final extension InternalFactory = InternalFactory.eINSTANCE
	public static AIProjectFactory eINSTANCE = AIProjectFactory.init
	
	extension de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension = new de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension
	
	static def AIProjectFactory init() {
		try {
			val fct = EPackage::Registry.INSTANCE.getEFactory(AiprojectPackage.eNS_URI) as AIProjectFactory
			if (fct != null)
				return fct as AIProjectFactory
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		new AIProjectFactory
	}
	
	/**
	 * This method creates an AIProject with the given id. Post create hook won't be triggered.
	 *
	 * @param ID: The id for the new element
	 * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
	 * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
	 * element of the created element
	 * @param ID: Indicates, if the post create hook should be executed
	 */
	def createAIProject(String ID, InternalModelElement ime, InternalModelElementContainer parent, boolean hook){
		super.createAIProject => [ 
			setID(ID)
			internal = ime ?: createInternalAIProject => [
				setID(ID + "_INTERNAL")
				eAdapters.add(new info.scce.cinco.product.aiProject.adapter.AIProjectEContentAdapter)
			]
		]
		
	}
	
	/**
	 * This method creates an AIProject with the given id. Post create hook won't be triggered.
	 */
	def createAIProject(String ID){
		createAIProject(ID,null,null,false)
	}
	
	/**
	 * This method creates an AIProject with the given id. Post create hook will be triggered.
	 */
	def createAIProject(InternalModelElementContainer parent){
		createAIProject(generateUUID,null,parent,true)
	}
	
	/**
	 * This method creates an AIProject with the given id. Post create hook will be triggered.
	 */
	def createAIProject(String ID, InternalModelElementContainer parent){
		createAIProject(ID,null,parent,true)
	}
	
	def createAIProject(String ID, InternalModelElement ime, InternalModelElementContainer parent){
		createAIProject(ID,ime,parent,true)
	}
	
	/**
	 * This method creates an AIProject with the given id. Post create hook won't be triggered.
	 */
	def createAIProject(InternalModelElement ime) {
		createAIProject(generateUUID,ime,null,false)
	}
	
	override createAIProject() {
		createAIProject(generateUUID)
	}
	
	private def <T extends IdentifiableElement> setInternal(T elm, InternalIdentifiableElement internal) {
		elm => [
			if (id.isNullOrEmpty)
				ID = generateUUID
			switch elm {
				GraphModel: elm.internalElement = internal as InternalGraphModel
				ModelElement: elm.internalElement = internal as InternalModelElement
				Type: elm.internalElement = internal as InternalType
			}
		]
	}

	/**
	* This method creates a new AIProject object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can 
	* simply call the AIProject's save method to save your changes.
	*/
	def info.scce.cinco.product.aiProject.aiproject.AIProject createAIProject(java.lang.String path, java.lang.String fileName) {
		var filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension("aiproject");
		var uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);
		var res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);
		var graph = info.scce.cinco.product.aiProject.factory.AIProjectFactory.eINSTANCE.createAIProject();
		
		org.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());

		res.getContents().add(graph.internalElement);
		
		try {
			res.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}

		return graph;
	}

}
