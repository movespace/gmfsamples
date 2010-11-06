package jfb.examples.gmf.school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Student extends EObject {

	/**
	 * @model
	 */
	String getName();
	
	/**
	 * Sets the value of the '{@link jfb.examples.gmf.school.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model
	 */
	EList<Student> getFriends();

}
