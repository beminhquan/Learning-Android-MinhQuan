package domain
import data.LoginStatus
import data.UserAccount

fun loginTraditional(account: UserAccount?): LoginStatus {
    if (account == null || account.email.isEmpty() || account.password.isEmpty()) {
        return LoginStatus.LOGIN_EMPTY
    }
    if (account.email == "admin" && account.password == "123") {
        return LoginStatus.LOGIN_SUCCESS
    }
    return LoginStatus.LOGIN_ERROR
}