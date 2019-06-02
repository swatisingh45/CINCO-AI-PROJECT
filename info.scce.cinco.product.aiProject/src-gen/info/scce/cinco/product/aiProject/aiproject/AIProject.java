/**
 */
package info.scce.cinco.product.aiProject.aiproject;

import graphmodel.GraphModel;

import info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject;

import info.scce.cinco.product.aiProject.aiproject.views.AIProjectView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Project</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.aiProject.aiproject.AiprojectPackage#getAIProject()
 * @model
 * @generated
 */
public interface AIProject extends GraphModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='AIProjectView aIProjectView = info.scce.cinco.product.aiProject.aiproject.views.ViewsFactory.eINSTANCE.createAIProjectView();\n\t\taIProjectView.setInternalAIProject((info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject)getInternalElement());\n\t\treturn aIProjectView;\n'"
	 * @generated
	 */
	AIProjectView getAIProjectView();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject) getInternalElement();\n'"
	 * @generated
	 */
	InternalAIProject getInternalAIProject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return true;'"
	 * @generated
	 */
	boolean isExactlyAIProject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" pathRequired="true" fileNameRequired="true" postCreateHookRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.core.runtime.IPath filePath = new org.eclipse.core.runtime.Path(path).append(fileName).addFileExtension(\"aiproject\");\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(filePath.toOSString(), true);\norg.eclipse.core.resources.IFile file = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().getFile(filePath);\norg.eclipse.emf.ecore.resource.Resource res = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().createResource(uri);\ninfo.scce.cinco.product.aiProject.aiproject.AIProject graph = info.scce.cinco.product.aiProject.factory.AIProjectFactory.eINSTANCE.createAIProject();\n\norg.eclipse.emf.ecore.util.EcoreUtil.setID(graph, org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());\n\nres.getContents().add(graph.getInternalElement());\n\ntry {\n\tres.save(null);\n} catch (java.io.IOException e) {\n\te.printStackTrace();\n}\n\nreturn graph;\n'"
	 * @generated
	 */
	AIProject newAIProject(String path, String fileName, boolean postCreateHook);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this;\n'"
	 * @generated
	 */
	AIProject getRootElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=''"
	 * @generated
	 */
	void postSave();

} // AIProject
