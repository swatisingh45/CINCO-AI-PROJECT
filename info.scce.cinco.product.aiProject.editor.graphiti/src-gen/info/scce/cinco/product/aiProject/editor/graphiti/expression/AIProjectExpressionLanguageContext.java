package info.scce.cinco.product.aiProject.editor.graphiti.expression;

public class AIProjectExpressionLanguageContext extends javax.el.ELContext {

	private java.lang.Object o;

	public AIProjectExpressionLanguageContext(java.lang.Object o) {
		this.o = o;
	}

	@Override
	public javax.el.VariableMapper getVariableMapper() {
		return null;
	}

	@Override
	public javax.el.FunctionMapper getFunctionMapper() {
		return null;
	}

	@Override
	public javax.el.ELResolver getELResolver() {
		javax.el.CompositeELResolver compELRes = new javax.el.CompositeELResolver();
		compELRes.add(new javax.el.BeanELResolver(true));
		compELRes.add(new AIProjectExpressionLanguageResolver(o));
		return compELRes;
	}
}
