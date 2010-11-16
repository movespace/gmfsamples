package jfb.examples.gmf.school.diagram.part;

import java.util.Collections;
import java.util.List;

import jfb.examples.gmf.school.diagram.providers.SchoolElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SchoolPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSchool1Group());
	}

	/**
	 * Creates "school" palette tool group
	 * @generated
	 */
	private PaletteContainer createSchool1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.School1Group_title);
		paletteContainer.setId("createSchool1Group"); //$NON-NLS-1$
		paletteContainer.add(createClassroom1CreationTool());
		paletteContainer.add(createStudent2CreationTool());
		paletteContainer.add(createStudentFriends3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassroom1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Classroom1CreationTool_title,
				Messages.Classroom1CreationTool_desc,
				Collections.singletonList(SchoolElementTypes.Classroom_3001));
		entry.setId("createClassroom1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SchoolElementTypes
				.getImageDescriptor(SchoolElementTypes.Classroom_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStudent2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Student2CreationTool_title,
				Messages.Student2CreationTool_desc,
				Collections.singletonList(SchoolElementTypes.Student_3002));
		entry.setId("createStudent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SchoolElementTypes
				.getImageDescriptor(SchoolElementTypes.Student_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStudentFriends3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StudentFriends3CreationTool_title,
				Messages.StudentFriends3CreationTool_desc,
				Collections
						.singletonList(SchoolElementTypes.StudentFriends_4001));
		entry.setId("createStudentFriends3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SchoolElementTypes
				.getImageDescriptor(SchoolElementTypes.StudentFriends_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
