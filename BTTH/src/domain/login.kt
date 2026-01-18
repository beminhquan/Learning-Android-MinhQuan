fun login(account:UserAccount?,onResult:(LoginStatus)->Unit){
    account?.email?.let {mail->
        account?.password?.let{pass->
            val status = when{
                mail.isEmpty() || pass.isEmpty() -> LoginStatus.LOGIN_EMPTY
                mail == "admin" && pass == "123" -> LoginStatus.LOGIN_SUCCESS
                else -> LoginStatus.LOGIN_ERROR
            }
            onResult(status)
            return
        }
    }
    onResult(LoginStatus.LOGIN_EMPTY)
}