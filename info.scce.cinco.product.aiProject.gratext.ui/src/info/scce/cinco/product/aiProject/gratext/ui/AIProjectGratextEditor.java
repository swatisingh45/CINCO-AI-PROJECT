package info.scce.cinco.product.aiProject.gratext.ui;

import de.jabc.cinco.meta.plugin.gratext.runtime.editor.MultiPageGratextEditor;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class AIProjectGratextEditor extends MultiPageGratextEditor {

	@Override
	protected XtextEditor getSourceEditor() {
		AIProjectGratextExecutableExtensionFactory fac = new AIProjectGratextExecutableExtensionFactory();
		try {
			Class<?> clazz = fac.getBundle().loadClass("org.eclipse.xtext.ui.editor.XtextEditor");
			Object editor = fac.getInjector().getInstance(clazz);
			return (XtextEditor) editor;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
