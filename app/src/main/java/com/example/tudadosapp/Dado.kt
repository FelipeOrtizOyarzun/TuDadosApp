package com.example.tudadosapp

class Dado(var lados : Int) {
    fun lanzar(): Int {
        return (1..lados).random()
    }
}