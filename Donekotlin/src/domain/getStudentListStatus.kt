package domain
import data.Student
import data.StudentListStatus

fun getStudentListStatus(students: List<Student>): StudentListStatus {
    return if (students.isEmpty()) StudentListStatus.STUDENT_LIST_EMPTY
    else StudentListStatus.STUDENT_LIST_SUCCESS
}