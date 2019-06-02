/**
 */
package info.scce.cinco.product.aiProject.gratext;

import info.scce.cinco.product.aiProject.aiproject.internal.InternalPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.aiProject.gratext.AIProjectGratextFactory
 * @model kind="package"
 * @generated
 */
public interface AIProjectGratextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gratext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/aiproject/gratext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gratext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AIProjectGratextPackage eINSTANCE = info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.aiProject.gratext.impl.AIProjectImpl <em>AI Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectImpl
	 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#getAIProject()
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
	int AI_PROJECT__ID = InternalPackage.INTERNAL_AI_PROJECT__ID;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT__MODEL_ELEMENTS = InternalPackage.INTERNAL_AI_PROJECT__MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT__ELEMENT = InternalPackage.INTERNAL_AI_PROJECT__ELEMENT;

	/**
	 * The number of structural features of the '<em>AI Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT_FEATURE_COUNT = InternalPackage.INTERNAL_AI_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.aiProject.gratext.impl._PlacedImpl <em>Placed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.aiProject.gratext.impl._PlacedImpl
	 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#get_Placed()
	 * @generated
	 */
	int _PLACED = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _PLACED__INDEX = 0;

	/**
	 * The number of structural features of the '<em>Placed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _PLACED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.aiProject.gratext.impl._EdgeSourceImpl <em>Edge Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.aiProject.gratext.impl._EdgeSourceImpl
	 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#get_EdgeSource()
	 * @generated
	 */
	int _EDGE_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EDGE_SOURCE__OUTGOING_EDGES = 0;

	/**
	 * The number of structural features of the '<em>Edge Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EDGE_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.aiProject.gratext.impl._EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.aiProject.gratext.impl._EdgeImpl
	 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#get_Edge()
	 * @generated
	 */
	int _EDGE = 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EDGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.aiProject.gratext.impl._PrimeImpl <em>Prime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.aiProject.gratext.impl._PrimeImpl
	 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#get_Prime()
	 * @generated
	 */
	int _PRIME = 4;

	/**
	 * The feature id for the '<em><b>Prime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _PRIME__PRIME = 0;

	/**
	 * The number of structural features of the '<em>Prime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _PRIME_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.aiProject.gratext.AIProject <em>AI Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Project</em>'.
	 * @see info.scce.cinco.product.aiProject.gratext.AIProject
	 * @generated
	 */
	EClass getAIProject();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.aiProject.gratext._Placed <em>Placed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placed</em>'.
	 * @see info.scce.cinco.product.aiProject.gratext._Placed
	 * @generated
	 */
	EClass get_Placed();

	/**
	 * Returns the meta object for the attribute '{@link info.scce.cinco.product.aiProject.gratext._Placed#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see info.scce.cinco.product.aiProject.gratext._Placed#getIndex()
	 * @see #get_Placed()
	 * @generated
	 */
	EAttribute get_Placed_Index();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.aiProject.gratext._EdgeSource <em>Edge Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Source</em>'.
	 * @see info.scce.cinco.product.aiProject.gratext._EdgeSource
	 * @generated
	 */
	EClass get_EdgeSource();

	/**
	 * Returns the meta object for the containment reference list '{@link info.scce.cinco.product.aiProject.gratext._EdgeSource#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Edges</em>'.
	 * @see info.scce.cinco.product.aiProject.gratext._EdgeSource#getOutgoingEdges()
	 * @see #get_EdgeSource()
	 * @generated
	 */
	EReference get_EdgeSource_OutgoingEdges();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.aiProject.gratext._Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see info.scce.cinco.product.aiProject.gratext._Edge
	 * @generated
	 */
	EClass get_Edge();

	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.aiProject.gratext._Prime <em>Prime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prime</em>'.
	 * @see info.scce.cinco.product.aiProject.gratext._Prime
	 * @generated
	 */
	EClass get_Prime();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.aiProject.gratext._Prime#getPrime <em>Prime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prime</em>'.
	 * @see info.scce.cinco.product.aiProject.gratext._Prime#getPrime()
	 * @see #get_Prime()
	 * @generated
	 */
	EReference get_Prime_Prime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AIProjectGratextFactory getAIProjectGratextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.aiProject.gratext.impl.AIProjectImpl <em>AI Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectImpl
		 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#getAIProject()
		 * @generated
		 */
		EClass AI_PROJECT = eINSTANCE.getAIProject();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.aiProject.gratext.impl._PlacedImpl <em>Placed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.aiProject.gratext.impl._PlacedImpl
		 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#get_Placed()
		 * @generated
		 */
		EClass _PLACED = eINSTANCE.get_Placed();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _PLACED__INDEX = eINSTANCE.get_Placed_Index();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.aiProject.gratext.impl._EdgeSourceImpl <em>Edge Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.aiProject.gratext.impl._EdgeSourceImpl
		 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#get_EdgeSource()
		 * @generated
		 */
		EClass _EDGE_SOURCE = eINSTANCE.get_EdgeSource();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _EDGE_SOURCE__OUTGOING_EDGES = eINSTANCE.get_EdgeSource_OutgoingEdges();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.aiProject.gratext.impl._EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.aiProject.gratext.impl._EdgeImpl
		 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#get_Edge()
		 * @generated
		 */
		EClass _EDGE = eINSTANCE.get_Edge();

		/**
		 * The meta object literal for the '{@link info.scce.cinco.product.aiProject.gratext.impl._PrimeImpl <em>Prime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.aiProject.gratext.impl._PrimeImpl
		 * @see info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextPackageImpl#get_Prime()
		 * @generated
		 */
		EClass _PRIME = eINSTANCE.get_Prime();

		/**
		 * The meta object literal for the '<em><b>Prime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _PRIME__PRIME = eINSTANCE.get_Prime_Prime();

	}

} //AIProjectGratextPackage
