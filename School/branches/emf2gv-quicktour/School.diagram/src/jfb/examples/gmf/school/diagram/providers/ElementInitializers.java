package jfb.examples.gmf.school.diagram.providers;

import jfb.examples.gmf.school.diagram.part.SchoolDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SchoolDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SchoolDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}

}
