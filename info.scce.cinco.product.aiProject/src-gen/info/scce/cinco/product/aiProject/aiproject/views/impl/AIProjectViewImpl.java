/**
 */
package info.scce.cinco.product.aiProject.aiproject.views.impl;

import info.scce.cinco.product.aiProject.aiproject.internal.InternalAIProject;

import info.scce.cinco.product.aiProject.aiproject.views.AIProjectView;
import info.scce.cinco.product.aiProject.aiproject.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AI Project View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.aiProject.aiproject.views.impl.AIProjectViewImpl#getInternalAIProject <em>Internal AI Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIProjectViewImpl extends EObjectImpl implements AIProjectView {
	/**
	 * The cached value of the '{@link #getInternalAIProject() <em>Internal AI Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalAIProject()
	 * @generated
	 * @ordered
	 */
	protected InternalAIProject internalAIProject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AIProjectViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.AI_PROJECT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAIProject getInternalAIProject() {
		if (internalAIProject != null && internalAIProject.eIsProxy()) {
			InternalEObject oldInternalAIProject = (InternalEObject)internalAIProject;
			internalAIProject = (InternalAIProject)eResolveProxy(oldInternalAIProject);
			if (internalAIProject != oldInternalAIProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewsPackage.AI_PROJECT_VIEW__INTERNAL_AI_PROJECT, oldInternalAIProject, internalAIProject));
			}
		}
		return internalAIProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAIProject basicGetInternalAIProject() {
		return internalAIProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalAIProject(InternalAIProject newInternalAIProject) {
		InternalAIProject oldInternalAIProject = internalAIProject;
		internalAIProject = newInternalAIProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.AI_PROJECT_VIEW__INTERNAL_AI_PROJECT, oldInternalAIProject, internalAIProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.AI_PROJECT_VIEW__INTERNAL_AI_PROJECT:
				if (resolve) return getInternalAIProject();
				return basicGetInternalAIProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.AI_PROJECT_VIEW__INTERNAL_AI_PROJECT:
				setInternalAIProject((InternalAIProject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.AI_PROJECT_VIEW__INTERNAL_AI_PROJECT:
				setInternalAIProject((InternalAIProject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.AI_PROJECT_VIEW__INTERNAL_AI_PROJECT:
				return internalAIProject != null;
		}
		return super.eIsSet(featureID);
	}

} //AIProjectViewImpl
