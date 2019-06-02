/**
 */
package info.scce.cinco.product.aiProject.aiproject;

import graphmodel.GraphmodelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.aiProject.aiproject.AiprojectFactory
 * @model kind="package"
 * @generated
 */
public interface AiprojectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aiproject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/aiproject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aiproject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AiprojectPackage eINSTANCE = info.scce.cinco.product.aiProject.aiproject.impl.AiprojectPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.aiProject.aiproject.impl.AIProjectImpl <em>AI Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.aiProject.aiproject.impl.AIProjectImpl
	 * @see info.scce.cinco.product.aiProject.aiproject.impl.AiprojectPackageImpl#getAIProject()
	 * @generated
	 */
	int AI_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT__ID = GraphmodelPackage.GRAPH_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT__INTERNAL_ELEMENT = GraphmodelPackage.GRAPH_MODEL__INTERNAL_ELEMENT;

	/**
	 * The number of structural features of the '<em>AI Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT_FEATURE_COUNT = GraphmodelPackage.GRAPH_MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___EQUALS__OBJECT = GraphmodelPackage.GRAPH_MODEL___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Hash Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___HASH_CODE = GraphmodelPackage.GRAPH_MODEL___HASH_CODE;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___SAVE = GraphmodelPackage.GRAPH_MODEL___SAVE;

	/**
	 * The operation id for the '<em>Get Internal Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_INTERNAL_ELEMENT = GraphmodelPackage.GRAPH_MODEL___GET_INTERNAL_ELEMENT;

	/**
	 * The operation id for the '<em>Transact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___TRANSACT__STRING_RUNNABLE = GraphmodelPackage.GRAPH_MODEL___TRANSACT__STRING_RUNNABLE;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_MODEL_ELEMENTS__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_MODEL_ELEMENTS__CLASS;

	/**
	 * The operation id for the '<em>Get All Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_ALL_NODES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_NODES;

	/**
	 * The operation id for the '<em>Get All Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_ALL_EDGES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_EDGES;

	/**
	 * The operation id for the '<em>Get All Containers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_ALL_CONTAINERS = GraphmodelPackage.GRAPH_MODEL___GET_ALL_CONTAINERS;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___CAN_CONTAIN__ELIST = GraphmodelPackage.GRAPH_MODEL___CAN_CONTAIN__ELIST;

	/**
	 * The operation id for the '<em>Can Contain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___CAN_CONTAIN__CLASS = GraphmodelPackage.GRAPH_MODEL___CAN_CONTAIN__CLASS;

	/**
	 * The operation id for the '<em>Get Containable Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_CONTAINABLE_TYPES = GraphmodelPackage.GRAPH_MODEL___GET_CONTAINABLE_TYPES;

	/**
	 * The operation id for the '<em>Get Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_MODEL_ELEMENTS = GraphmodelPackage.GRAPH_MODEL___GET_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_EDGES__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_EDGES__CLASS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_NODES__CLASS = GraphmodelPackage.GRAPH_MODEL___GET_NODES__CLASS;

	/**
	 * The operation id for the '<em>Update Model Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___UPDATE_MODEL_ELEMENTS = GraphmodelPackage.GRAPH_MODEL___UPDATE_MODEL_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_NODES = GraphmodelPackage.GRAPH_MODEL___GET_NODES;

	/**
	 * The operation id for the '<em>Get All Node Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_ALL_NODE_TYPES = GraphmodelPackage.GRAPH_MODEL___GET_ALL_NODE_TYPES;

	/**
	 * The operation id for the '<em>Get Internal Container Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_INTERNAL_CONTAINER_ELEMENT = GraphmodelPackage.GRAPH_MODEL___GET_INTERNAL_CONTAINER_ELEMENT;

	/**
	 * The operation id for the '<em>Get AI Project View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_AI_PROJECT_VIEW = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Internal AI Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_INTERNAL_AI_PROJECT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Exactly AI Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___IS_EXACTLY_AI_PROJECT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>New AI Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___NEW_AI_PROJECT__STRING_STRING_BOOLEAN = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Root Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___GET_ROOT_ELEMENT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Post Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT___POST_SAVE = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>AI Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT_OPERATION_COUNT = GraphmodelPackage.GRAPH_MODEL_OPERATION_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.aiProject.aiproject.AIProject <em>AI Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Project</em>'.
	 * @see info.scce.cinco.product.aiProject.aiproject.AIProject
	 * @generated
	 */
	EClass getAIProject();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.aiProject.aiproject.AIProject#getAIProjectView() <em>Get AI Project View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get AI Project View</em>' operation.
	 * @see info.scce.cinco.product.aiProject.aiproject.AIProject#getAIProjectView()
	 * @generated
	 */
	EOperation getAIProject__GetAIProjectView();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.aiProject.aiproject.AIProject#getInternalAIProject() <em>Get Internal AI Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Internal AI Project</em>' operation.
	 * @see info.scce.cinco.product.aiProject.aiproject.AIProject#getInternalAIProject()
	 * @generated
	 */
	EOperation getAIProject__GetInternalAIProject();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.aiProject.aiproject.AIProject#isExactlyAIProject() <em>Is Exactly AI Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exactly AI Project</em>' operation.
	 * @see info.scce.cinco.product.aiProject.aiproject.AIProject#isExactlyAIProject()
	 * @generated
	 */
	EOperation getAIProject__IsExactlyAIProject();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.aiProject.aiproject.AIProject#newAIProject(java.lang.String, java.lang.String, boolean) <em>New AI Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New AI Project</em>' operation.
	 * @see info.scce.cinco.product.aiProject.aiproject.AIProject#newAIProject(java.lang.String, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getAIProject__NewAIProject__String_String_boolean();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.aiProject.aiproject.AIProject#getRootElement() <em>Get Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Element</em>' operation.
	 * @see info.scce.cinco.product.aiProject.aiproject.AIProject#getRootElement()
	 * @generated
	 */
	EOperation getAIProject__GetRootElement();

	/**
	 * Returns the meta object for the '{@link info.scce.cinco.product.aiProject.aiproject.AIProject#postSave() <em>Post Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Save</em>' operation.
	 * @see info.scce.cinco.product.aiProject.aiproject.AIProject#postSave()
	 * @generated
	 */
	EOperation getAIProject__PostSave();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AiprojectFactory getAiprojectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.aiProject.aiproject.impl.AIProjectImpl <em>AI Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.aiProject.aiproject.impl.AIProjectImpl
		 * @see info.scce.cinco.product.aiProject.aiproject.impl.AiprojectPackageImpl#getAIProject()
		 * @generated
		 */
		EClass AI_PROJECT = eINSTANCE.getAIProject();

		/**
		 * The meta object literal for the '<em><b>Get AI Project View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AI_PROJECT___GET_AI_PROJECT_VIEW = eINSTANCE.getAIProject__GetAIProjectView();

		/**
		 * The meta object literal for the '<em><b>Get Internal AI Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AI_PROJECT___GET_INTERNAL_AI_PROJECT = eINSTANCE.getAIProject__GetInternalAIProject();

		/**
		 * The meta object literal for the '<em><b>Is Exactly AI Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AI_PROJECT___IS_EXACTLY_AI_PROJECT = eINSTANCE.getAIProject__IsExactlyAIProject();

		/**
		 * The meta object literal for the '<em><b>New AI Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AI_PROJECT___NEW_AI_PROJECT__STRING_STRING_BOOLEAN = eINSTANCE.getAIProject__NewAIProject__String_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Root Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AI_PROJECT___GET_ROOT_ELEMENT = eINSTANCE.getAIProject__GetRootElement();

		/**
		 * The meta object literal for the '<em><b>Post Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AI_PROJECT___POST_SAVE = eINSTANCE.getAIProject__PostSave();

	}

} //AiprojectPackage
