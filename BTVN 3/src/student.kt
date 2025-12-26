
data class Student(

    val id: Int,

    val name: String,

    val score: Int

)
fun main() {

    val Student: List<Student> = listOf(
        Student(1,"quan",6),
        Student(2,"minh",5),
        Student(3,"huynh",9),
        Student(4,"van",9)
    )
    for ((id,name,score) in Student){
    println("ID: $id Ten: $name Diem: $score")
}
    for ((id,name,score) in Student){
        println("Ten: $name")


}
  val Pscore = Student.filter { it.score >=5}
    Pscore.forEach {
        println("ID: ${it.id} Ten: ${it.name} Diem: ${it.score}")
    }
    val kiemtrarot = Student.any { it.score <5}
        println(if  (kiemtrarot == true){"có người rớt"} else {"không có người rớt"})
    val kiemtradau = Student.all { it.score >=5}
    println(if  (kiemtradau == false){"có người rớt"} else {"đậu hết"})
    val result = Student.find { it.id == 2}
    println("ID: ${result?.id} Ten: ${result?.name} Diem: ${result?.score}")
    val student = mutableMapOf<Int, Student>(
        1 to Student(1,"quan",6),
        2 to Student(2,"minh",5),
        3 to Student(3,"huynh",9),
        4 to Student(4,"van",9),
    )
    println(Student[3])
}