package com.home.salaryuses.app.ui.login.ui.login

import com.home.salaryuses.app.ui.login.LoggedInUserView

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)