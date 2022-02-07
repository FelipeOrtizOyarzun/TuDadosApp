package com.example.tudadosapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgDado: ImageView = findViewById(R.id.imgDado)
        val imgDado2: ImageView = findViewById(R.id.imgDado2)
        val miDado = Dado(6)
        val miDado2 = Dado(6)

        val btnLanzar: Button = findViewById(R.id.btnLanzar)
        btnLanzar.setOnClickListener {
            var resultado1 = miDado.lanzar()
            var resultado2 = miDado2.lanzar()
            when (resultado1) {
                1 -> {
                    imgDado.setImageResource(R.drawable.dice_1) //metodo para cambiar imagen
                    // Toast.makeText(this, "Sacaste ${resultado}. Mas suerte para la proxima", Toast.LENGTH_LONG).show()
                }
                2 -> {
                    imgDado.setImageResource(R.drawable.dice_2)
                    // Toast.makeText(this, "Sacaste ${resultado}. Muy bajo", Toast.LENGTH_LONG).show()
                }
                3 -> {
                    imgDado.setImageResource(R.drawable.dice_3)
                    // Toast.makeText(this, "Sacaste ${resultado}. Muy bajo", Toast.LENGTH_LONG).show()
                }
                4 -> {
                    imgDado.setImageResource(R.drawable.dice_4)
                    // Toast.makeText(this, "Sacaste ${resultado}. Esto ya es mas decente", Toast.LENGTH_LONG).show()
                }
                5 -> {
                    imgDado.setImageResource(R.drawable.dice_5)
                    // Toast.makeText(this, "Sacaste ${resultado}. Se acabo lo que se daba, miren lo que tengo", Toast.LENGTH_LONG).show()
                }
                6 -> {
                    imgDado.setImageResource(R.drawable.dice_6)
                    // Toast.makeText(this, "Sacaste ${resultado}. I have lucky", Toast.LENGTH_LONG).show()
                }
            }
            when (resultado2) {
                1 -> {
                    imgDado2.setImageResource(R.drawable.dice_1) //metodo para cambiar imagen
                }
                2 -> {
                    imgDado2.setImageResource(R.drawable.dice_2)
                }
                3 -> {
                    imgDado2.setImageResource(R.drawable.dice_3)
                }
                4 -> {
                    imgDado2.setImageResource(R.drawable.dice_4)
                }
                5 -> {
                    imgDado2.setImageResource(R.drawable.dice_5)
                }
                6 -> {
                    imgDado2.setImageResource(R.drawable.dice_6)
                }
            }
        }
    }
}