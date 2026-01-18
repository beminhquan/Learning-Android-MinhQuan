package data
enum class SearchStatus(val message: String) {
    EMPTY_KEYWORD("Từ khóa tìm kiếm trống"),
    SEARCH_SUCCESS("Tìm thấy kết quả"),
    SEARCH_NO_RESULT("Không tìm thấy kết quả")
}