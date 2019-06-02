/**
 */
package info.scce.cinco.product.aiProject.aiproject.views;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.aiProject.aiproject.views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cinco.scce.info/product/aiproject/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aiproject-views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = info.scce.cinco.product.aiProject.aiproject.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link info.scce.cinco.product.aiProject.aiproject.views.impl.AIProjectViewImpl <em>AI Project View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see info.scce.cinco.product.aiProject.aiproject.views.impl.AIProjectViewImpl
	 * @see info.scce.cinco.product.aiProject.aiproject.views.impl.ViewsPackageImpl#getAIProjectView()
	 * @generated
	 */
	int AI_PROJECT_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Internal AI Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT_VIEW__INTERNAL_AI_PROJECT = 0;

	/**
	 * The number of structural features of the '<em>AI Project View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT_VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AI Project View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AI_PROJECT_VIEW_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link info.scce.cinco.product.aiProject.aiproject.views.AIProjectView <em>AI Project View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AI Project View</em>'.
	 * @see info.scce.cinco.product.aiProject.aiproject.views.AIProjectView
	 * @generated
	 */
	EClass getAIProjectView();

	/**
	 * Returns the meta object for the reference '{@link info.scce.cinco.product.aiProject.aiproject.views.AIProjectView#getInternalAIProject <em>Internal AI Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal AI Project</em>'.
	 * @see info.scce.cinco.product.aiProject.aiproject.views.AIProjectView#getInternalAIProject()
	 * @see #getAIProjectView()
	 * @generated
	 */
	EReference getAIProjectView_InternalAIProject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

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
		 * The meta object literal for the '{@link info.scce.cinco.product.aiProject.aiproject.views.impl.AIProjectViewImpl <em>AI Project View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see info.scce.cinco.product.aiProject.aiproject.views.impl.AIProjectViewImpl
		 * @see info.scce.cinco.product.aiProject.aiproject.views.impl.ViewsPackageImpl#getAIProjectView()
		 * @generated
		 */
		EClass AI_PROJECT_VIEW = eINSTANCE.getAIProjectView();

		/**
		 * The meta object literal for the '<em><b>Internal AI Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AI_PROJECT_VIEW__INTERNAL_AI_PROJECT = eINSTANCE.getAIProjectView_InternalAIProject();

	}

} //ViewsPackage
