package com.example.myappdesafiobiblioteca

import android.util.Log

fun String.encriptarValor():String {
    return this.replace("a","4")
        .replace("e","3")
        .replace("i","1")
        .replace("o","0")
        .replace("u","T_T")


}

fun String.toLog(){

    Log.d("algo",this)
}
