package jfb.examples.gmf.school.ui.provider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jfb.examples.gmf.school.Classroom;
import jfb.examples.gmf.school.School;
import jfb.examples.gmf.school.Student;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class StudentFriendsPropertyDescriptor extends PropertyDescriptor {

	public StudentFriendsPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	@Override
	public CellEditor createPropertyEditor(Composite parent) {
		return new ExtendedDialogCellEditor(parent, getLabelProvider()) {
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				// Here you are free to open a custom dialog that you have
				// created. In this example, we simply open an
				// ElementListSelectionDialog

				// Let's retrieve the current student and all the available
				// students
				Student student = (Student) object;
				School school = (School) student.eContainer().eContainer();
				List<Student> allStudents = new ArrayList<Student>();
				for (Classroom classroom : school.getClassrooms()) {
					allStudents.addAll(classroom.getStudents());
				}

				// The student cannot be a friend of himself
				allStudents.remove(student);

				// Dialog creation
				ElementListSelectionDialog dialog = new ElementListSelectionDialog(
						PlatformUI.getWorkbench().getDisplay().getActiveShell(),
						getLabelProvider());
				dialog.setElements(allStudents.toArray());
				dialog.setInitialSelections(student.getFriends().toArray());
				dialog.setTitle("Available friends list");
				dialog.setMessage("Select the friends of '" + student.getName()
						+ "'");
				dialog.setMultipleSelection(true);

				// Open the dialog and retrieve the user selection
				int result = dialog.open();
				labelProvider.dispose();
				return result == Window.OK ? Arrays.asList(dialog.getResult())
						: null;
			}
		};
	}

}
