/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package jfb.examples.gmf.school;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jfb.examples.gmf.school.SchoolFactory
 * @model kind="package"
 * @generated
 */
public interface SchoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "school";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///jfb/examples/gmf/school.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jfb.examples.gmf.school";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchoolPackage eINSTANCE = jfb.examples.gmf.school.impl.SchoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.school.impl.ClassroomImpl <em>Classroom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.school.impl.ClassroomImpl
	 * @see jfb.examples.gmf.school.impl.SchoolPackageImpl#getClassroom()
	 * @generated
	 */
	int CLASSROOM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM__TEACHER = 1;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM__RANK = 2;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM__CAPACITY = 3;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM__STUDENTS = 4;

	/**
	 * The number of structural features of the '<em>Classroom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSROOM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.school.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.school.impl.DiagramImpl
	 * @see jfb.examples.gmf.school.impl.SchoolPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>School</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__SCHOOL = 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.school.impl.SchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.school.impl.SchoolImpl
	 * @see jfb.examples.gmf.school.impl.SchoolPackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Director</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__DIRECTOR = 1;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__ZIP_CODE = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__CITY = 3;

	/**
	 * The feature id for the '<em><b>Classrooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__CLASSROOMS = 4;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link jfb.examples.gmf.school.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jfb.examples.gmf.school.impl.StudentImpl
	 * @see jfb.examples.gmf.school.impl.SchoolPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NICKNAME = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__AGE = 2;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FRIENDS = 3;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.school.Classroom <em>Classroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classroom</em>'.
	 * @see jfb.examples.gmf.school.Classroom
	 * @generated
	 */
	EClass getClassroom();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.Classroom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jfb.examples.gmf.school.Classroom#getName()
	 * @see #getClassroom()
	 * @generated
	 */
	EAttribute getClassroom_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link jfb.examples.gmf.school.Classroom#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see jfb.examples.gmf.school.Classroom#getStudents()
	 * @see #getClassroom()
	 * @generated
	 */
	EReference getClassroom_Students();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.Classroom#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see jfb.examples.gmf.school.Classroom#getCapacity()
	 * @see #getClassroom()
	 * @generated
	 */
	EAttribute getClassroom_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.Classroom#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teacher</em>'.
	 * @see jfb.examples.gmf.school.Classroom#getTeacher()
	 * @see #getClassroom()
	 * @generated
	 */
	EAttribute getClassroom_Teacher();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.Classroom#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see jfb.examples.gmf.school.Classroom#getRank()
	 * @see #getClassroom()
	 * @generated
	 */
	EAttribute getClassroom_Rank();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.school.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see jfb.examples.gmf.school.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link jfb.examples.gmf.school.Diagram#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>School</em>'.
	 * @see jfb.examples.gmf.school.Diagram#getSchool()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_School();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.school.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see jfb.examples.gmf.school.School
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.School#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jfb.examples.gmf.school.School#getName()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link jfb.examples.gmf.school.School#getClassrooms <em>Classrooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classrooms</em>'.
	 * @see jfb.examples.gmf.school.School#getClassrooms()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Classrooms();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.School#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see jfb.examples.gmf.school.School#getCity()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_City();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.School#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see jfb.examples.gmf.school.School#getZipCode()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_ZipCode();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.School#getDirector <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Director</em>'.
	 * @see jfb.examples.gmf.school.School#getDirector()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Director();

	/**
	 * Returns the meta object for class '{@link jfb.examples.gmf.school.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see jfb.examples.gmf.school.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jfb.examples.gmf.school.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the reference list '{@link jfb.examples.gmf.school.Student#getFriends <em>Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Friends</em>'.
	 * @see jfb.examples.gmf.school.Student#getFriends()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Friends();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.Student#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see jfb.examples.gmf.school.Student#getAge()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Age();

	/**
	 * Returns the meta object for the attribute '{@link jfb.examples.gmf.school.Student#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see jfb.examples.gmf.school.Student#getNickname()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Nickname();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchoolFactory getSchoolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.school.impl.ClassroomImpl <em>Classroom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.school.impl.ClassroomImpl
		 * @see jfb.examples.gmf.school.impl.SchoolPackageImpl#getClassroom()
		 * @generated
		 */
		EClass CLASSROOM = eINSTANCE.getClassroom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSROOM__NAME = eINSTANCE.getClassroom_Name();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSROOM__STUDENTS = eINSTANCE.getClassroom_Students();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSROOM__CAPACITY = eINSTANCE.getClassroom_Capacity();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSROOM__TEACHER = eINSTANCE.getClassroom_Teacher();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSROOM__RANK = eINSTANCE.getClassroom_Rank();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.school.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.school.impl.DiagramImpl
		 * @see jfb.examples.gmf.school.impl.SchoolPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__SCHOOL = eINSTANCE.getDiagram_School();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.school.impl.SchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.school.impl.SchoolImpl
		 * @see jfb.examples.gmf.school.impl.SchoolPackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__NAME = eINSTANCE.getSchool_Name();

		/**
		 * The meta object literal for the '<em><b>Classrooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__CLASSROOMS = eINSTANCE.getSchool_Classrooms();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__CITY = eINSTANCE.getSchool_City();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__ZIP_CODE = eINSTANCE.getSchool_ZipCode();

		/**
		 * The meta object literal for the '<em><b>Director</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__DIRECTOR = eINSTANCE.getSchool_Director();

		/**
		 * The meta object literal for the '{@link jfb.examples.gmf.school.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jfb.examples.gmf.school.impl.StudentImpl
		 * @see jfb.examples.gmf.school.impl.SchoolPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Friends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__FRIENDS = eINSTANCE.getStudent_Friends();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__AGE = eINSTANCE.getStudent_Age();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NICKNAME = eINSTANCE.getStudent_Nickname();

	}

} //SchoolPackage
