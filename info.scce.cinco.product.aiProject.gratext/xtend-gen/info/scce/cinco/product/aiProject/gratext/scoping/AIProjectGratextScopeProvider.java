package info.scce.cinco.product.aiProject.gratext.scoping;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import graphmodel.internal.InternalIdentifiableElement;
import java.util.List;
import java.util.function.Predicate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 */
@SuppressWarnings("all")
public class AIProjectGratextScopeProvider extends AbstractDeclarativeScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _elvis = null;
    IScope _scope = this.getScope(context, reference.getName());
    if (_scope != null) {
      _elvis = _scope;
    } else {
      IScope _scope_1 = super.getScope(context, reference);
      _elvis = _scope_1;
    }
    return _elvis;
  }
  
  protected IScope _getScope(final EObject element, final String refName) {
    return null;
  }
  
  public IScope scopeForContents(final EObject obj, final Class<?>... types) {
    return this.toScope(Iterables.<InternalIdentifiableElement>filter(IterableExtensions.<EObject>filter(this.getContents(EcoreUtil.getRootContainer(obj)), this.anyTypeOf(types)), InternalIdentifiableElement.class));
  }
  
  public Iterable<EObject> getContents(final EObject obj) {
    final Iterable<EObject> _function = () -> {
      return obj.eAllContents();
    };
    final Iterable<EObject> iterable = _function;
    return iterable;
  }
  
  public Function1<Object, Boolean> anyTypeOf(final Class<?>... types) {
    final Function1<Object, Boolean> _function = (Object obj) -> {
      final Predicate<Class<?>> _function_1 = (Class<?> it) -> {
        return it.isInstance(obj);
      };
      return Boolean.valueOf(((List<Class<?>>)Conversions.doWrapArray(types)).stream().anyMatch(_function_1));
    };
    return _function;
  }
  
  public IScope toScope(final Iterable<InternalIdentifiableElement> elements) {
    final Function<InternalIdentifiableElement, QualifiedName> _function = (InternalIdentifiableElement it) -> {
      return QualifiedName.create(it.getId());
    };
    return Scopes.<InternalIdentifiableElement>scopeFor(elements, _function, IScope.NULLSCOPE);
  }
  
  public IScope getScope(final EObject element, final String refName) {
    return _getScope(element, refName);
  }
}
