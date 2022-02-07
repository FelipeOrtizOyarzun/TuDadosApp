package com.example.tudadosapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun generates_number() {
        val miDado = Dado(6)
        // val resultado = miDado.lanzar()
        val resultado = 7
        println("El resultado es ${resultado}")
        assertTrue("El resultado no esta dentro de 1 y 6, Sacaste ${resultado}", resultado in 1..6)
    }

}