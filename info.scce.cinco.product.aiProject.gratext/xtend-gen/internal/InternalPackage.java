package internal;

/**
 * This is a workaround for a bug. Xtext does not recognize the 'internal'
 * package in GraphModel.ecore and tends to generate code against the class
 * package.InternalPackage instead of graphmodel.internal.InternalPackage
 */
@SuppressWarnings("all")
public interface InternalPackage extends graphmodel.internal.InternalPackage {
}
