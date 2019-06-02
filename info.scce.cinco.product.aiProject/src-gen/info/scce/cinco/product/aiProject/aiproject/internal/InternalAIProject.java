/**
 */
package info.scce.cinco.product.aiProject.aiproject.internal;

import de.jabc.cinco.meta.core.mgl.model.constraints.ContainmentConstraint;

import graphmodel.internal.InternalGraphModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AI Project</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see info.scce.cinco.product.aiProject.aiproject.internal.InternalPackage#getInternalAIProject()
 * @model
 * @generated
 */
public interface InternalAIProject extends InternalGraphModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="graphmodel.ContainmentConstraint"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body=' org.eclipse.emf.common.util.BasicEList&lt;ContainmentConstraint&gt;constraints = \n\tnew org.eclipse.emf.common.util.BasicEList&lt;ContainmentConstraint&gt;();\nreturn constraints;\n\n'"
	 * @generated
	 */
	EList<ContainmentConstraint> getContainmentConstraints();

} // InternalAIProject
