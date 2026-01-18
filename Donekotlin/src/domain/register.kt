package domain
import data.RegisterInput
import data.RegisterStatus

fun register(input: RegisterInput, existingEmails: List<String>): RegisterStatus {
    return when {
        input.email.isNullOrEmpty() || input.password.isNullOrEmpty() || input.confirmPassword.isNullOrEmpty() ->
            RegisterStatus.INVALID_INPUT
        input.password != input.confirmPassword ->
            RegisterStatus.PASSWORD_NOT_MATCH
        existingEmails.contains(input.email) ->
            RegisterStatus.EMAIL_EXIST
        else -> RegisterStatus.SUCCESS
    }
}