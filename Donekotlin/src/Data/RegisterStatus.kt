package data
enum class RegisterStatus(val message: String) {
    INVALID_INPUT("Dữ liệu đầu vào không hợp lệ"),
    PASSWORD_NOT_MATCH("Mật khẩu không khớp"),
    EMAIL_EXIST("Email đã tồn tại"),
    SUCCESS("Đăng ký thành công")
}