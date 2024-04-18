package br.senai.sp.jandira.viagemab2.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

data class Viagem(
    var id: Int = 0,
    var destino: String = " ",
    var descricao: String = " ",
    var dataChegada: LocalDate = LocalDate.now(),
    var dataPartida: LocalDate = LocalDate.now(),
    var imagem: Painter? = null
)