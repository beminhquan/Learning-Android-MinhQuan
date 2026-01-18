package data
enum class ResultStatus(val message: String) {
    RESULT_PASS("Đạt"),
    RESULT_FAIL("Trượt"),
    RESULT_INVALID("Điểm không hợp lệ")
}