/**
 */
package info.scce.cinco.product.aiProject.aiproject.views;

import info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Project View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.aiProject.aiproject.views.AIProjectView#getInternalAIProject <em>Internal AI Project</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.aiProject.aiproject.views.ViewsPackage#getAIProjectView()
 * @model
 * @generated
 */
public interface AIProjectView extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal AI Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal AI Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal AI Project</em>' reference.
	 * @see #setInternalAIProject(InternalAIProject)
	 * @see info.scce.cinco.product.aiProject.aiproject.views.ViewsPackage#getAIProjectView_InternalAIProject()
	 * @model
	 * @generated
	 */
	InternalAIProject getInternalAIProject();

	/**
	 * Sets the value of the '{@link info.scce.cinco.product.aiProject.aiproject.views.AIProjectView#getInternalAIProject <em>Internal AI Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal AI Project</em>' reference.
	 * @see #getInternalAIProject()
	 * @generated
	 */
	void setInternalAIProject(InternalAIProject value);

} // AIProjectView
