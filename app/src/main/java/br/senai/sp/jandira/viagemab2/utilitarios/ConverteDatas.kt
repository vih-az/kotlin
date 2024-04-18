package br.senai.sp.jandira.viagemab2.utilitarios

import java.time.LocalDate

fun encurtadorDeDatas(dataChegada: LocalDate, dataPartida: LocalDate): String{
    var diaChegada = dataChegada.dayOfMonth
    var mesChegada = dataChegada.month.toString()
    var mesChegadaAbreviada = mesChegada.substring(0..2)
    var diaPartida = dataPartida.dayOfMonth
    var mesPartida = dataPartida.month.toString()
    var mesPartidaAbreviada = mesPartida.substring(0..2)
    return "$diaChegada $mesChegadaAbreviada - $diaPartida $mesPartidaAbreviada"
}