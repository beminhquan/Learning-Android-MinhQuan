import data.*
import domain.*

fun main(){
    val name = UserAccount("admin", "123")
    login(name) { status ->
        println(status.message)
    }
    login(UserAccount("", "")) { status ->
        println(status.message)
    }
    login(UserAccount("admin", "sai_pass")) { status ->
        println(status.message)
    }

    val listEmail = listOf("quanhihi@gmail.com", "quanheheh@gmail.com")
    val reg = RegisterInput("quan@gmail.com", "123", "123")
    println(register(reg, listEmail).message)
    println(register(RegisterInput("", "", ""), listEmail).message)
    println(register(RegisterInput("new@gmail.com", "123", "456"), listEmail).message)
    println(register(RegisterInput("quanhihi@gmail.com", "123", "123"), listEmail).message)

    val students = listOf(
        Student(1, "quan", 8.5),
        Student(2, "huynh", 7.0),
        Student(3, "van", 4.5),
        Student(4, "minh", 1.5),
    )
    println(getStudentListStatus(students).message)
    showStudents(students)
    println(getStudentListStatus(emptyList()).message)

    val id = 1
    findStudentDetail(students, id) { status, sv ->
        if (status == StudentDetailStatus.DETAIL_FOUND) {
            println("${status.message}: ${sv?.name}")
        } else {
            println(status.message)
        }
    }
    findStudentDetail(students, 99) { status, sv ->
        println(status.message)
    }

    println(evaluateScore(11.0).message)
    println(evaluateScore(8.5).message)
    println(evaluateScore(4.0).message)

    println(getCourseListStatus(emptyList()).message)
    val courses = listOf(Course("ADR", "Android"), Course("IOS", "Swift"))
    println(getCourseListStatus(courses).message)

    println(download(200).message)
    println(download(408).message)
    println(download(503).message)
    println(download(null).message)

    val animals = listOf("Con Meo", "Con Cho", "Con Ho")
    println(search("", animals).message)
    println(search("Con Meo", animals).message)
    println(search("Con Ga", animals).message)
}