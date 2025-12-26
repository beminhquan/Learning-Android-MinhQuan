fun main() {
    val so: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14)
    val sochan = so.filter{it %2 == 0}
        .map {it*2}
    println(sochan)

    val chu: List<String?> = listOf("A","X","c","v","z","G","Y")
    val chuinhoa = chu.filter { it!=null && it==it.uppercase()}
    println (chuinhoa)

    val student: Map<String, Int> = mapOf(
        "Quan" to 4,
        "Huynh" to 8,
        "Van" to 5,
        "Minh" to 9,
    )

    val diem = student.filter { it.value >= 5 }
    println(diem)
}


