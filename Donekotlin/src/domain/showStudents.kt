package domain
import data.Student

fun showStudents(students: List<Student>) {
    val list = students.also {
        println("Log: Số lượng sinh viên là ${it.size}")
    }
    with(list) {
        forEach { println(it) }
    }
}