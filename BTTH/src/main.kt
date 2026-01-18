


fun main() {
    val name = UserAccount("admin", "123")
    login(name) { status ->
        println(status.message)
    }


    val listEmail = listOf("quanhihi@gmail.com", "quanheheh@gmail.com")
    val reg = RegisterInput("quan@gmail.com", "123", "123")


    println(register(reg, listEmail).message)
    val students = listOf(
        Student(1, "quan", 8.5),
        Student(2, "huynh", 7.0),
        Student(3, "van", 4.5),
        Student(4, "minh", 1.5),
    )
    println(getStudentListStatus(students).message)
    showStudents(students)


    val id = 1
    findStudentDetail(students, id) { status, sv ->
        if (status == StudentDetailStatus.DETAIL_FOUND) {
            println("${status.message}: ${sv?.name}")
        } else {
            println(status.message)
        }
    }

}
