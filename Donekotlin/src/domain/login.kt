package domain
import data.LoginStatus
import data.UserAccount

fun login(account: UserAccount?, onResult: (LoginStatus) -> Unit) {
    account?.let { acc ->
        val status = if (acc.email.isEmpty() || acc.password.isEmpty()) {
            LoginStatus.LOGIN_EMPTY
        } else if (acc.email == "admin" && acc.password == "123") {
            LoginStatus.LOGIN_SUCCESS
        } else {
            LoginStatus.LOGIN_ERROR
        }
        onResult(status)
    } ?: onResult(LoginStatus.LOGIN_EMPTY)
}