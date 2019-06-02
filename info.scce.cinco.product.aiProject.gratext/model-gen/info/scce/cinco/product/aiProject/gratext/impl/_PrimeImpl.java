/**
 */
package info.scce.cinco.product.aiProject.gratext.impl;

import info.scce.cinco.product.aiProject.gratext.AIProjectGratextPackage;
import info.scce.cinco.product.aiProject.gratext._Prime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link info.scce.cinco.product.aiProject.gratext.impl._PrimeImpl#getPrime <em>Prime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class _PrimeImpl extends EObjectImpl implements _Prime {
	/**
	 * The cached value of the '{@link #getPrime() <em>Prime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrime()
	 * @generated
	 * @ordered
	 */
	protected EObject prime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _PrimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AIProjectGratextPackage.Literals._PRIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPrime() {
		if (prime != null && prime.eIsProxy()) {
			InternalEObject oldPrime = (InternalEObject)prime;
			prime = eResolveProxy(oldPrime);
			if (prime != oldPrime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AIProjectGratextPackage._PRIME__PRIME, oldPrime, prime));
			}
		}
		return prime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetPrime() {
		return prime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrime(EObject newPrime) {
		EObject oldPrime = prime;
		prime = newPrime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AIProjectGratextPackage._PRIME__PRIME, oldPrime, prime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AIProjectGratextPackage._PRIME__PRIME:
				if (resolve) return getPrime();
				return basicGetPrime();
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
			case AIProjectGratextPackage._PRIME__PRIME:
				setPrime((EObject)newValue);
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
			case AIProjectGratextPackage._PRIME__PRIME:
				setPrime((EObject)null);
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
			case AIProjectGratextPackage._PRIME__PRIME:
				return prime != null;
		}
		return super.eIsSet(featureID);
	}

} //_PrimeImpl
