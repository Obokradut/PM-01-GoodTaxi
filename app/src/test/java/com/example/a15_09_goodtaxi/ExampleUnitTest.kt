package com.example.a15_09_goodtaxi

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ValidUnitTests {

    @Test
    fun correct_email() {
        val email: String = "dechenkovms@gmail.com"
        assertEquals(email.getCorrectEmail(), true)
    }


    @Test
    fun correct_password() {
        val enter_password: String = "12341234"
        val db_password: String = "12341234"
        assertEquals(enter_password.passwordEqual(db_password), true)
    }
}

/* Функция для сравнения паролей */
private fun String.passwordEqual(dbPassword: String): Boolean = this == dbPassword


/* Функция для валидации почтового адреса*/
private fun String.getCorrectEmail(regexEmail: String = "^[A-Za-z](.*)([@])(.+)(\\.)(.+)"): Boolean = regexEmail.toRegex().matches(this)
