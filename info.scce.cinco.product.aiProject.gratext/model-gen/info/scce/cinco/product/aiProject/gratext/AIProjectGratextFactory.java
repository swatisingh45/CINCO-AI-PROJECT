/**
 */
package info.scce.cinco.product.aiProject.gratext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.aiProject.gratext.AIProjectGratextPackage
 * @generated
 */
public interface AIProjectGratextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AIProjectGratextFactory eINSTANCE = info.scce.cinco.product.aiProject.gratext.impl.AIProjectGratextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AI Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AI Project</em>'.
	 * @generated
	 */
	AIProject createAIProject();

	/**
	 * Returns a new object of class '<em>Placed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placed</em>'.
	 * @generated
	 */
	_Placed create_Placed();

	/**
	 * Returns a new object of class '<em>Edge Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Source</em>'.
	 * @generated
	 */
	_EdgeSource create_EdgeSource();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	_Edge create_Edge();

	/**
	 * Returns a new object of class '<em>Prime</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prime</em>'.
	 * @generated
	 */
	_Prime create_Prime();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AIProjectGratextPackage getAIProjectGratextPackage();

} //AIProjectGratextFactory
