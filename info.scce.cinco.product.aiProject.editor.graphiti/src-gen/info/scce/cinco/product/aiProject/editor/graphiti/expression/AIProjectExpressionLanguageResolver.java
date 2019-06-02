package info.scce.cinco.product.aiProject.editor.graphiti.expression;

public class AIProjectExpressionLanguageResolver extends javax.el.ELResolver{

	private javax.el.ELResolver delegate = new javax.el.BeanELResolver();
	private java.lang.Object o;
	
	public AIProjectExpressionLanguageResolver(java.lang.Object o) {
		this.o = o;
	}
	
	@Override
	public Class<?> getCommonPropertyType(javax.el.ELContext arg0, java.lang.Object base) {
		if (base == null) {
			base = o;
		}
		return delegate.getCommonPropertyType(arg0, base);
	}

	@Override
	public java.util.Iterator<java.beans.FeatureDescriptor> getFeatureDescriptors(
			javax.el.ELContext arg0, java.lang.Object base) {
		if (base == null)
			base = o;
		
		return delegate.getFeatureDescriptors(arg0, base);
	}

	@Override
	public Class<?> getType(javax.el.ELContext arg0, java.lang.Object base, java.lang.Object arg2) {
		if (base == null)
			base = o;
		return delegate.getType(arg0, base, arg2);
	}

	@Override
	public java.lang.Object getValue(javax.el.ELContext arg0, java.lang.Object base, java.lang.Object arg2) {
		if (base == null)
			base = o;
		return delegate.getValue(arg0, base, arg2);
	}

	@Override
	public boolean isReadOnly(javax.el.ELContext arg0, java.lang.Object base, java.lang.Object arg2) {
		if (base == null) {
			base = o;
		}
		return delegate.isReadOnly(arg0, base, arg2);
	}

	@Override
	public void setValue(javax.el.ELContext arg0, java.lang.Object base, java.lang.Object arg2,
			java.lang.Object arg3) {
		if (base == null)
			base = o;
		delegate.setValue(arg0, base, arg2, arg3);
		
	}
}
