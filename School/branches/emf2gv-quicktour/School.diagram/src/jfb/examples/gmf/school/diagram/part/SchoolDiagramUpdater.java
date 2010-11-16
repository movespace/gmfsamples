package jfb.examples.gmf.school.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jfb.examples.gmf.school.Classroom;
import jfb.examples.gmf.school.Diagram;
import jfb.examples.gmf.school.School;
import jfb.examples.gmf.school.SchoolPackage;
import jfb.examples.gmf.school.Student;
import jfb.examples.gmf.school.diagram.edit.parts.ClassroomClassroomStudentsCompartmentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.ClassroomEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.DiagramEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolSchoolClassroomsCompartmentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentFriendsEditPart;
import jfb.examples.gmf.school.diagram.providers.SchoolElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SchoolDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SchoolNodeDescriptor> getSemanticChildren(View view) {
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000SemanticChildren(view);
		case SchoolSchoolClassroomsCompartmentEditPart.VISUAL_ID:
			return getSchoolSchoolClassroomsCompartment_7001SemanticChildren(view);
		case ClassroomClassroomStudentsCompartmentEditPart.VISUAL_ID:
			return getClassroomClassroomStudentsCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolNodeDescriptor> getSchoolSchoolClassroomsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		School modelElement = (School) containerView.getElement();
		LinkedList<SchoolNodeDescriptor> result = new LinkedList<SchoolNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClassrooms().iterator(); it
				.hasNext();) {
			Classroom childElement = (Classroom) it.next();
			int visualID = SchoolVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassroomEditPart.VISUAL_ID) {
				result.add(new SchoolNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SchoolNodeDescriptor> getClassroomClassroomStudentsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Classroom modelElement = (Classroom) containerView.getElement();
		LinkedList<SchoolNodeDescriptor> result = new LinkedList<SchoolNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStudents().iterator(); it
				.hasNext();) {
			Student childElement = (Student) it.next();
			int visualID = SchoolVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StudentEditPart.VISUAL_ID) {
				result.add(new SchoolNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SchoolNodeDescriptor> getDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Diagram modelElement = (Diagram) view.getElement();
		LinkedList<SchoolNodeDescriptor> result = new LinkedList<SchoolNodeDescriptor>();
		{
			School childElement = modelElement.getSchool();
			int visualID = SchoolVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SchoolEditPart.VISUAL_ID) {
				result.add(new SchoolNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getContainedLinks(View view) {
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000ContainedLinks(view);
		case SchoolEditPart.VISUAL_ID:
			return getSchool_2001ContainedLinks(view);
		case ClassroomEditPart.VISUAL_ID:
			return getClassroom_3001ContainedLinks(view);
		case StudentEditPart.VISUAL_ID:
			return getStudent_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getIncomingLinks(View view) {
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case SchoolEditPart.VISUAL_ID:
			return getSchool_2001IncomingLinks(view);
		case ClassroomEditPart.VISUAL_ID:
			return getClassroom_3001IncomingLinks(view);
		case StudentEditPart.VISUAL_ID:
			return getStudent_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getOutgoingLinks(View view) {
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case SchoolEditPart.VISUAL_ID:
			return getSchool_2001OutgoingLinks(view);
		case ClassroomEditPart.VISUAL_ID:
			return getClassroom_3001OutgoingLinks(view);
		case StudentEditPart.VISUAL_ID:
			return getStudent_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getSchool_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getClassroom_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getStudent_3002ContainedLinks(
			View view) {
		Student modelElement = (Student) view.getElement();
		LinkedList<SchoolLinkDescriptor> result = new LinkedList<SchoolLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Student_Friends_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getSchool_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getClassroom_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getStudent_3002IncomingLinks(
			View view) {
		Student modelElement = (Student) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SchoolLinkDescriptor> result = new LinkedList<SchoolLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Student_Friends_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getSchool_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getClassroom_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SchoolLinkDescriptor> getStudent_3002OutgoingLinks(
			View view) {
		Student modelElement = (Student) view.getElement();
		LinkedList<SchoolLinkDescriptor> result = new LinkedList<SchoolLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Student_Friends_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SchoolLinkDescriptor> getIncomingFeatureModelFacetLinks_Student_Friends_4001(
			Student target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SchoolLinkDescriptor> result = new LinkedList<SchoolLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == SchoolPackage.eINSTANCE
					.getStudent_Friends()) {
				result.add(new SchoolLinkDescriptor(setting.getEObject(),
						target, SchoolElementTypes.StudentFriends_4001,
						StudentFriendsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SchoolLinkDescriptor> getOutgoingFeatureModelFacetLinks_Student_Friends_4001(
			Student source) {
		LinkedList<SchoolLinkDescriptor> result = new LinkedList<SchoolLinkDescriptor>();
		for (Iterator<?> destinations = source.getFriends().iterator(); destinations
				.hasNext();) {
			Student destination = (Student) destinations.next();
			result.add(new SchoolLinkDescriptor(source, destination,
					SchoolElementTypes.StudentFriends_4001,
					StudentFriendsEditPart.VISUAL_ID));
		}
		return result;
	}

}
