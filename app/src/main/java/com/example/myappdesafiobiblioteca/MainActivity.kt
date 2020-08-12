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
        val book2 = LibrosEscolares(nameBook = "Los hombres que no amaban a las mujeres", ISBN = "9789584281998" , añoPub = 2018 , editorial = "Planeta", cantPag = 608 , price = 19600 , autorBook =  "David Lagercrantz " , modeBook = " electronico")
        val book3 = LibrosEscolares(nameBook = "La chica que soñaba con una cerilla y un bidón de gasolina", ISBN = "9789584281995" , añoPub = 2016 , editorial = "Planeta", cantPag = 608 , price = 19600 , autorBook =  "David Lagercrantz " , modeBook = " audiolibro")
        var book4 = LibrosEscolares(nameBook = "El hombre que perseguía su sombra", ISBN = "9789584281993" , añoPub = 2017 , editorial = "Planeta", cantPag = 608 , price = 19600 , autorBook =  "David Lagercrantz " , modeBook = " debolsillo")
        val textViewbook : TextView = findViewById(R.id.namebook)
        val textViewisbn : TextView = findViewById(R.id.textViewISBN)
        val textViewanio : TextView = findViewById(R.id.textViewanio)
        val textViewedit : TextView = findViewById(R.id.textViewEdito)
        val textViewpag : TextView = findViewById(R.id.textViewcantpag)
        val textViewprice : TextView = findViewById(R.id.textViewPrecio)
        val textViewautor : TextView = findViewById(R.id.textViewAutor)
        val textViewmode : TextView = findViewById(R.id.textViewTipo)
        textViewprice.text = book1.precioFormateado()
        textViewbook.text  = book1.imprimirDatos()
       textViewisbn.text = book1.ISBN
        textViewanio.text = book1.añoPub.toString()
       textViewedit.text = book1.editorial
        textViewpag.text = book1.cantPag.toString()
        textViewautor.text = book1.autorBook
        textViewmode.text = book1.modeBook




    }



}