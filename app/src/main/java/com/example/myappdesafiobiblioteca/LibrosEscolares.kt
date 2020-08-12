package com.example.myappdesafiobiblioteca

class LibrosEscolares (  val nameBook : String ,
                         val ISBN: String ,
                         val añoPub : Int,
                         val editorial : String ,
                         val cantPag: Int ,
                         val price : Int,
                         val autorBook : String ,
                         val modeBook:  String) {

    fun precioFormateado(): String = "\$${this.price}"
 //   fun ImprimirDatos(nameBook: String, ISBN: String , añoPub : Int, editorial : String ,cantPag: Int ,price : Int,autorBook : String ,modeBook:  String) : String =
 //       {this.nameBook}



fun imprimirDatos() : String =
    "${this.nameBook}"






}