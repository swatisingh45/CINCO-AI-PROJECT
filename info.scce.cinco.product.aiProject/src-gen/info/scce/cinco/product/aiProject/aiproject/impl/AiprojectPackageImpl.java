/**
 */
package info.scce.cinco.product.aiProject.aiproject.impl;

import graphmodel.GraphmodelPackage;

import info.scce.cinco.product.aiProject.aiproject.AIProject;
import info.scce.cinco.product.aiProject.aiproject.AiprojectFactory;
import info.scce.cinco.product.aiProject.aiproject.AiprojectPackage;

import info.scce.cinco.product.aiProject.aiproject.internal.InternalPackage;

import info.scce.cinco.product.aiProject.aiproject.internal.impl.InternalPackageImpl;

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
public class AiprojectPackageImpl extends EPackageImpl implements AiprojectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aiProjectEClass = null;

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
	 * @see info.scce.cinco.product.aiProject.aiproject.AiprojectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AiprojectPackageImpl() {
		super(eNS_URI, AiprojectFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AiprojectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AiprojectPackage init() {
		if (isInited) return (AiprojectPackage)EPackage.Registry.INSTANCE.getEPackage(AiprojectPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAiprojectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AiprojectPackageImpl theAiprojectPackage = registeredAiprojectPackage instanceof AiprojectPackageImpl ? (AiprojectPackageImpl)registeredAiprojectPackage : new AiprojectPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GraphmodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InternalPackage.eNS_URI);
		InternalPackageImpl theInternalPackage = (InternalPackageImpl)(registeredPackage instanceof InternalPackageImpl ? registeredPackage : InternalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);

		// Create package meta-data objects
		theAiprojectPackage.createPackageContents();
		theInternalPackage.createPackageContents();
		theViewsPackage.createPackageContents();

		// Initialize created meta-data
		theAiprojectPackage.initializePackageContents();
		theInternalPackage.initializePackageContents();
		theViewsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAiprojectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AiprojectPackage.eNS_URI, theAiprojectPackage);
		return theAiprojectPackage;
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
	public EOperation getAIProject__GetAIProjectView() {
		return aiProjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIProject__GetInternalAIProject() {
		return aiProjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIProject__IsExactlyAIProject() {
		return aiProjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIProject__NewAIProject__String_String_boolean() {
		return aiProjectEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIProject__GetRootElement() {
		return aiProjectEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAIProject__PostSave() {
		return aiProjectEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AiprojectFactory getAiprojectFactory() {
		return (AiprojectFactory)getEFactoryInstance();
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
		createEOperation(aiProjectEClass, AI_PROJECT___GET_AI_PROJECT_VIEW);
		createEOperation(aiProjectEClass, AI_PROJECT___GET_INTERNAL_AI_PROJECT);
		createEOperation(aiProjectEClass, AI_PROJECT___IS_EXACTLY_AI_PROJECT);
		createEOperation(aiProjectEClass, AI_PROJECT___NEW_AI_PROJECT__STRING_STRING_BOOLEAN);
		createEOperation(aiProjectEClass, AI_PROJECT___GET_ROOT_ELEMENT);
		createEOperation(aiProjectEClass, AI_PROJECT___POST_SAVE);
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
		ViewsPackage theViewsPackage = (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		GraphmodelPackage theGraphmodelPackage = (GraphmodelPackage)EPackage.Registry.INSTANCE.getEPackage(GraphmodelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theInternalPackage);
		getESubpackages().add(theViewsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aiProjectEClass.getESuperTypes().add(theGraphmodelPackage.getGraphModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(aiProjectEClass, AIProject.class, "AIProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAIProject__GetAIProjectView(), theViewsPackage.getAIProjectView(), "getAIProjectView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAIProject__GetInternalAIProject(), theInternalPackage.getInternalAIProject(), "getInternalAIProject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAIProject__IsExactlyAIProject(), ecorePackage.getEBoolean(), "isExactlyAIProject", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAIProject__NewAIProject__String_String_boolean(), this.getAIProject(), "newAIProject", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "postCreateHook", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAIProject__GetRootElement(), this.getAIProject(), "getRootElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAIProject__PostSave(), null, "postSave", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AiprojectPackageImpl
