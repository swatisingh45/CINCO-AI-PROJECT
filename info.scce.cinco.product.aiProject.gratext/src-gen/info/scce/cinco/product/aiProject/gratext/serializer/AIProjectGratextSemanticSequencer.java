/*
 * generated by Xtext 2.14.0
 */
package info.scce.cinco.product.aiProject.gratext.serializer;

import com.google.inject.Inject;
import graphmodel.internal._Decoration;
import graphmodel.internal._Point;
import info.scce.cinco.product.aiProject.gratext.AIProject;
import info.scce.cinco.product.aiProject.gratext.AIProjectGratextPackage;
import info.scce.cinco.product.aiProject.gratext.services.AIProjectGratextGrammarAccess;
import internal.InternalPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AIProjectGratextSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AIProjectGratextGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AIProjectGratextPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AIProjectGratextPackage.AI_PROJECT:
				sequence_AIProject(context, (AIProject) semanticObject); 
				return; 
			}
		else if (epackage == InternalPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case InternalPackage._DECORATION:
				sequence__Decoration(context, (_Decoration) semanticObject); 
				return; 
			case InternalPackage._POINT:
				sequence__Point(context, (_Point) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AIProject returns AIProject
	 *
	 * Constraint:
	 *     id=_ID?
	 */
	protected void sequence_AIProject(ISerializationContext context, AIProject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     _Decoration returns _Decoration
	 *
	 * Constraint:
	 *     (nameHint=_EString? locationShift=_Point)
	 */
	protected void sequence__Decoration(ISerializationContext context, _Decoration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     _Point returns _Point
	 *
	 * Constraint:
	 *     (x=_EInt y=_EInt)
	 */
	protected void sequence__Point(ISerializationContext context, _Point semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, InternalPackage.Literals._POINT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InternalPackage.Literals._POINT__X));
			if (transientValues.isValueTransient(semanticObject, InternalPackage.Literals._POINT__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InternalPackage.Literals._POINT__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.get_PointAccess().getX_EIntParserRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.get_PointAccess().getY_EIntParserRuleCall_4_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
}
