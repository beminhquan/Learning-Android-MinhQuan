
fun baib1(){
    val age: Int = 20
    println( if(age >=18) "du tuoi" else "khong du")
}
fun baib2() {
    var name: String? = "mot hai ba"
    val length = name?.length ?: 0
    println(length)
}
fun baib3() {
    var email: String? = null
    val length = email?.length ?:0
    println (length)
}
fun baib4() {

    var score: Int =5
    var result: String = if (score >=5) "đậu" else "rớt"
    println(result)
}
fun baic1() {
    var age: Int =11
    println(if (age <12)"Trẻ em" else if(age >=18)"người lớn" else "thiếu niên")
}
fun baic2() {
    var username: String? = null ?:"khách"
    println(username)
}
fun baic2v2() {
    var username: String? ="minh"
    println(if (username != null) (username) else "khách" )
}
fun printLength(text: String?){
    println(text!!.length)

}

fun main(){
    baib1()
    baib2()
    baib3()
    baib4()
    baic1()
    baic2()
    baic2v2()
    printLength()



}
