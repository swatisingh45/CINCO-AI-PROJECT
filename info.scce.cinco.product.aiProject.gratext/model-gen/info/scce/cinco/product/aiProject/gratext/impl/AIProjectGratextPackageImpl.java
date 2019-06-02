/**
 */
package info.scce.cinco.product.aiProject.gratext.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.aiProject.aiproject.AiprojectPackage;

import info.scce.cinco.product.aiProject.aiproject.internal.InternalPackage;

import info.scce.cinco.product.aiProject.gratext.AIProject;
import info.scce.cinco.product.aiProject.gratext.AIProjectGratextFactory;
import info.scce.cinco.product.aiProject.gratext.AIProjectGratextPackage;
import info.scce.cinco.product.aiProject.gratext._Edge;
import info.scce.cinco.product.aiProject.gratext._EdgeSource;
import info.scce.cinco.product.aiProject.gratext._Placed;
import info.scce.cinco.product.aiProject.gratext._Prime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AIProjectGratextPackageImpl extends EPackageImpl implements AIProjectGratextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _PlacedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _EdgeSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _EdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _PrimeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see info.scce.cinco.product.aiProject.gratext.AIProjectGratextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AIProjectGratextPackageImpl() {
		super(eNS_URI, AIProjectGratextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AIProjectGratextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AIProjectGratextPackage init() {
		if (isInited) return (AIProjectGratextPackage)EPackage.Registry.INSTANCE.getEPackage(AIProjectGratextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAIProjectGratextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AIProjectGratextPackageImpl theAIProjectGratextPackage = registeredAIProjectGratextPackage instanceof AIProjectGratextPackageImpl ? (AIProjectGratextPackageImpl)registeredAIProjectGratextPackage : new AIProjectGratextPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AiprojectPackage.eINSTANCE.eClass();
		GraphmodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAIProjectGratextPackage.createPackageContents();

		// Initialize created meta-data
		theAIProjectGratextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAIProjectGratextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AIProjectGratextPackage.eNS_URI, theAIProjectGratextPackage);
		return theAIProjectGratextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAIProject() {
		return aiProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_Placed() {
		return _PlacedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute get_Placed_Index() {
		return (EAttribute)_PlacedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_EdgeSource() {
		return _EdgeSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference get_EdgeSource_OutgoingEdges() {
		return (EReference)_EdgeSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_Edge() {
		return _EdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_Prime() {
		return _PrimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference get_Prime_Prime() {
		return (EReference)_PrimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIProjectGratextFactory getAIProjectGratextFactory() {
		return (AIProjectGratextFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aiProjectEClass = createEClass(AI_PROJECT);

		_PlacedEClass = createEClass(_PLACED);
		createEAttribute(_PlacedEClass, _PLACED__INDEX);

		_EdgeSourceEClass = createEClass(_EDGE_SOURCE);
		createEReference(_EdgeSourceEClass, _EDGE_SOURCE__OUTGOING_EDGES);

		_EdgeEClass = createEClass(_EDGE);

		_PrimeEClass = createEClass(_PRIME);
		createEReference(_PrimeEClass, _PRIME__PRIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InternalPackage theInternalPackage = (InternalPackage)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aiProjectEClass.getESuperTypes().add(theInternalPackage.getInternalAIProject());

		// Initialize classes and features; add operations and parameters
		initEClass(aiProjectEClass, AIProject.class, "AIProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(_PlacedEClass, _Placed.class, "_Placed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_Placed_Index(), ecorePackage.getEInt(), "index", "-1", 0, 1, _Placed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_EdgeSourceEClass, _EdgeSource.class, "_EdgeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(get_EdgeSource_OutgoingEdges(), this.get_Edge(), null, "outgoingEdges", null, 0, -1, _EdgeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_EdgeEClass, _Edge.class, "_Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(_PrimeEClass, _Prime.class, "_Prime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(get_Prime_Prime(), ecorePackage.getEObject(), null, "prime", null, 0, 1, _Prime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

} //AIProjectGratextPackageImpl
