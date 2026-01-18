fun showStudents(students: List<Student>) {
    students.also {
        println("tổng số sinh viên: ${it.size}")
    }.forEach { student ->
        with(student) {
            println("SV: $name Điểm: $score")
        }
    }
}