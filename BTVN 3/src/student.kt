data class Student(
    val id: Int,
    val name: String,
    val score: Int
)
fun cau1a(Student: List<Student>) {
    for ((id, name, score) in Student) {
        println("ID: $id Ten: $name Diem: $score")
    }
}
fun cau1b(Student: List<Student>) {
    for ((id, name, score) in Student) {
        println("Ten: $name")
    }
}
fun cau1c(Student: List<Student>) {
    val Pscore = Student.filter { it.score >= 5 }
    Pscore.forEach {
        println("ID: ${it.id} Ten: ${it.name} Diem: ${it.score}")
    }
}
fun cau2(Student: List<Student>) {
    val kiemtrarot = Student.any { it.score < 5 }
    println(if (kiemtrarot == true) { "có người rớt" } else { "không có người rớt" })
}
fun cau3(Student: List<Student>) {
    val kiemtradau = Student.all { it.score >= 5 }
    println(if (kiemtradau == false) { "có người rớt" } else { "đậu hết" })
}
fun cau4(Student: List<Student>) {
    val result = Student.find { it.id == 2 }
    println("ID: ${result?.id} Ten: ${result?.name} Diem: ${result?.score}")
}
fun cau5(studentMap: Map<Int, Student>) {
    println(studentMap[3])
}
fun main() {
    val listStudent: List<Student> = listOf(
        Student(1, "quan", 6),
        Student(2, "minh", 5),
        Student(3, "huynh", 9),
        Student(4, "van", 9)
    )

    val mapStudent = mutableMapOf<Int, Student>(
        1 to Student(1, "quan", 6),
        2 to Student(2, "minh", 5),
        3 to Student(3, "huynh", 9),
        4 to Student(4, "van", 9),
    )


    cau1a(listStudent)
    cau1b(listStudent)
    cau1c(listStudent)
    cau2(listStudent)
    cau3(listStudent)
    cau4(listStudent)
    cau5(mapStudent)
}