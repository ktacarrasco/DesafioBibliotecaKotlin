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


}