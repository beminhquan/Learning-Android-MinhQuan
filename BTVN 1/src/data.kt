
data class Student(

    val id: Int,

    val name: String,

    val score: Int

)
fun main() {

    val Student: List<Student> = listOf(Student(1,"quan",8))
    print(Student)


}