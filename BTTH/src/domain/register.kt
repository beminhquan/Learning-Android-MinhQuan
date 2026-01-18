fun register(input: RegisterInput?, existingEmail: List<String>): RegisterStatus {
    if (input == null) return RegisterStatus.INVALID_INPUT
    return when {
        input.email.isNullOrBlank() || input.password.isNullOrBlank() || input.confirmPassword.isNullOrBlank() ->
            RegisterStatus.INVALID_INPUT
        input.password != input.confirmPassword ->
            RegisterStatus.PASSWORD_NOT_MATCH
        existingEmail.contains(input.email) ->
            RegisterStatus.EMAIL_EXIST
        else -> RegisterStatus.SUCCESS
    }
}