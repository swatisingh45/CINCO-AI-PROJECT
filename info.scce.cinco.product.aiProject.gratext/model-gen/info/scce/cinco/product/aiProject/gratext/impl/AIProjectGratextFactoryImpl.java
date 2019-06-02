/**
 */
package info.scce.cinco.product.aiProject.gratext.impl;

import info.scce.cinco.product.aiProject.gratext.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AIProjectGratextFactoryImpl extends EFactoryImpl implements AIProjectGratextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AIProjectGratextFactory init() {
		try {
			AIProjectGratextFactory theAIProjectGratextFactory = (AIProjectGratextFactory)EPackage.Registry.INSTANCE.getEFactory(AIProjectGratextPackage.eNS_URI);
			if (theAIProjectGratextFactory != null) {
				return theAIProjectGratextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AIProjectGratextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIProjectGratextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AIProjectGratextPackage.AI_PROJECT: return createAIProject();
			case AIProjectGratextPackage._PLACED: return create_Placed();
			case AIProjectGratextPackage._EDGE_SOURCE: return create_EdgeSource();
			case AIProjectGratextPackage._EDGE: return create_Edge();
			case AIProjectGratextPackage._PRIME: return create_Prime();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIProject createAIProject() {
		AIProjectImpl aiProject = new AIProjectImpl();
		return aiProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _Placed create_Placed() {
		_PlacedImpl _Placed = new _PlacedImpl();
		return _Placed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _EdgeSource create_EdgeSource() {
		_EdgeSourceImpl _EdgeSource = new _EdgeSourceImpl();
		return _EdgeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _Edge create_Edge() {
		_EdgeImpl _Edge = new _EdgeImpl();
		return _Edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _Prime create_Prime() {
		_PrimeImpl _Prime = new _PrimeImpl();
		return _Prime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIProjectGratextPackage getAIProjectGratextPackage() {
		return (AIProjectGratextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AIProjectGratextPackage getPackage() {
		return AIProjectGratextPackage.eINSTANCE;
	}

} //AIProjectGratextFactoryImpl
