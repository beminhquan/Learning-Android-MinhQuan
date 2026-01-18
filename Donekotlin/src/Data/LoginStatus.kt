package data
enum class LoginStatus(val message: String) {
    LOGIN_EMPTY("Thông tin đăng nhập không được để trống"),
    LOGIN_SUCCESS("Đăng nhập thành công"),
    LOGIN_ERROR("Sai tên đăng nhập hoặc mật khẩu")
}