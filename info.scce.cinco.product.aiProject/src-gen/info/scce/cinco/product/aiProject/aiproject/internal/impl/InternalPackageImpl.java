/**
 */
package info.scce.cinco.product.aiProject.aiproject.internal.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.aiProject.aiproject.AiprojectPackage;

import info.scce.cinco.product.aiProject.aiproject.impl.AiprojectPackageImpl;

import info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject;
import info.scce.cinco.product.aiProject.aiproject.internal.InternalFactory;
import info.scce.cinco.product.aiProject.aiproject.internal.InternalPackage;

import info.scce.cinco.product.aiProject.aiproject.views.ViewsPackage;

import info.scce.cinco.product.aiProject.aiproject.views.impl.ViewsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalPackageImpl extends EPackageImpl implements InternalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalAIProjectEClass = null;

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
	 * @see info.scce.cinco.product.aiProject.aiproject.internal.InternalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InternalPackageImpl() {
		super(eNS_URI, InternalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InternalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InternalPackage init() {
		if (isInited) return (InternalPackage)EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInternalPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InternalPackageImpl theInternalPackage = registeredInternalPackage instanceof InternalPackageImpl ? (InternalPackageImpl)registeredInternalPackage : new InternalPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AiprojectPackage.eNS_URI);
		AiprojectPackageImpl theAiprojectPackage = (AiprojectPackageImpl)(registeredPackage instanceof AiprojectPackageImpl ? registeredPackage : AiprojectPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);

		// Create package meta-data objects
		theInternalPackage.createPackageContents();
		theAiprojectPackage.createPackageContents();
		theViewsPackage.createPackageContents();

		// Initialize created meta-data
		theInternalPackage.initializePackageContents();
		theAiprojectPackage.initializePackageContents();
		theViewsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInternalPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InternalPackage.eNS_URI, theInternalPackage);
		return theInternalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalAIProject() {
		return internalAIProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInternalAIProject__GetContainmentConstraints() {
		return internalAIProjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalFactory getInternalFactory() {
		return (InternalFactory)getEFactoryInstance();
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
		internalAIProjectEClass = createEClass(INTERNAL_AI_PROJECT);
		createEOperation(internalAIProjectEClass, INTERNAL_AI_PROJECT___GET_CONTAINMENT_CONSTRAINTS);
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
		graphmodel.internal.InternalPackage theInternalPackage_1 = (graphmodel.internal.InternalPackage)EPackage.Registry.INSTANCE.getEPackage(graphmodel.internal.InternalPackage.eNS_URI);
		GraphmodelPackage theGraphmodelPackage = (GraphmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		internalAIProjectEClass.getESuperTypes().add(theInternalPackage_1.getInternalGraphModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(internalAIProjectEClass, InternalAIProject.class, "InternalAIProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getInternalAIProject__GetContainmentConstraints(), theGraphmodelPackage.getContainmentConstraint(), "getContainmentConstraints", 0, -1, IS_UNIQUE, IS_ORDERED);
	}

} //InternalPackageImpl
