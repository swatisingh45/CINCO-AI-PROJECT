/**
 */
package info.scce.cinco.product.aiProject.gratext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.aiProject.gratext._EdgeSource#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 * </ul>
 *
 * @see info.scce.cinco.product.aiProject.gratext.AIProjectGratextPackage#get_EdgeSource()
 * @model
 * @generated
 */
public interface _EdgeSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' containment reference list.
	 * The list contents are of type {@link info.scce.cinco.product.aiProject.gratext._Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' containment reference list.
	 * @see info.scce.cinco.product.aiProject.gratext.AIProjectGratextPackage#get_EdgeSource_OutgoingEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<_Edge> getOutgoingEdges();

} // _EdgeSource
