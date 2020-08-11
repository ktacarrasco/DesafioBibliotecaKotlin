package com.example.myappdesafiobiblioteca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  var juegoArcade= JuegoArcade(name :"poker", cantidadJugadores :4, TipoJuego "texas")
       // Log.d("juego", juegoArcade.toString())

      //  "catalina".encriptarValor().toLog()

       val book1 = LibrosEscolares(nameBook = "Lo que no te mata te hace más fuerte", ISBN = "9789584281999" , añoPub = 2015 , editorial = "Planeta", cantPag = 608 , price = 19600 , autorBook =  "David Lagercrantz " , modeBook = " digital")
        val book2 = LibrosEscolares(nameBook = "Lo que no te mata te hace más fuerte", ISBN = "9789584281998" , añoPub = 2018 , editorial = "Planeta", cantPag = 608 , price = 19600 , autorBook =  "David Lagercrantz " , modeBook = " electronico")
        val book3 = LibrosEscolares(nameBook = "Lo que no te mata te hace más fuerte", ISBN = "9789584281995" , añoPub = 2016 , editorial = "Planeta", cantPag = 608 , price = 19600 , autorBook =  "David Lagercrantz " , modeBook = " audiolibro")
        var book4 = LibrosEscolares(nameBook = "Lo que no te mata te hace más fuerte", ISBN = "9789584281993" , añoPub = 2017 , editorial = "Planeta", cantPag = 608 , price = 19600 , autorBook =  "David Lagercrantz " , modeBook = " debolsillo")
        val textView : TextView = findViewById(R.id.namebook)
        textView.text = book1.precioFormateado()
    }



}