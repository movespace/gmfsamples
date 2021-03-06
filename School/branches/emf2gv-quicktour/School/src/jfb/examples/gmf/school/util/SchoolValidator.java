/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jfb.examples.gmf.school.util;

import java.util.Map;

import jfb.examples.gmf.school.Classroom;
import jfb.examples.gmf.school.Diagram;
import jfb.examples.gmf.school.School;
import jfb.examples.gmf.school.SchoolPackage;
import jfb.examples.gmf.school.Student;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see jfb.examples.gmf.school.SchoolPackage
 * @generated
 */
public class SchoolValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SchoolValidator INSTANCE = new SchoolValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "jfb.examples.gmf.school";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Classroom'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASSROOM__VALIDATE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Student'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STUDENT__VALIDATE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SchoolPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SchoolPackage.CLASSROOM:
				return validateClassroom((Classroom)value, diagnostics, context);
			case SchoolPackage.DIAGRAM:
				return validateDiagram((Diagram)value, diagnostics, context);
			case SchoolPackage.SCHOOL:
				return validateSchool((School)value, diagnostics, context);
			case SchoolPackage.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassroom(Classroom classroom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classroom, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classroom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classroom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classroom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classroom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classroom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classroom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classroom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classroom, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassroom_validate(classroom, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Classroom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassroom_validate(Classroom classroom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return classroom.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagram(Diagram diagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchool(School school, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(school, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(student, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(student, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudent_validate(student, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent_validate(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return student.validate(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SchoolValidator
