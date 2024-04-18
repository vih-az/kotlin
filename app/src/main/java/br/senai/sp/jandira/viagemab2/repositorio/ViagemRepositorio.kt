package br.senai.sp.jandira.viagemab2.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.viagemab.R
import br.senai.sp.jandira.viagemab2.model.Viagem
import java.time.LocalDate

class ViagemRepositorio{
    @Composable
    fun listarTodasAsViagens(): List<Viagem> {
        val londres = Viagem(
            id = 1,
            destino = "londres",
            descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana. Seu centro abriga as sedes imponentes do Parlamento, a famosa torre do relógio do Big Ben e a Abadia de Westminster, local de coroação dos monarcas britânicos. Do outro lado do rio Tâmisa, a roda gigante London Eye tem vista panorâmica do complexo cultural da margem sul e de toda a cidade.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.londres)
        )
        val alemanha = Viagem(
            id = 2,
            destino = "alemanha",
            descricao = "A Alemanha é um país situado na Europa Ocidental com uma paisagem de florestas, rios, cordilheiras e praias do Mar do Norte. A nação tem mais de 2 milênios de história. Berlim, a capital, abriga cenários artísticos e de vida noturna, o Portão de Brandemburgo e muitos locais relacionados à Segunda Guerra Mundial. Munique é conhecida pela Oktoberfest e pelos beer halls, entre eles o Hofbräuhaus, do século XVI. Frankfurt, com seus arranha-céus, abriga o Banco Central Europeu.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.alemanha)
        )
        val seul = Viagem(
            id = 2,
            destino = "seul",
            descricao = "Seul, a capital da Coreia do Sul, é uma grande metrópole onde arranha-céus, metrôs de alta tecnologia e a cultura pop se misturam com templos budistas, palácios e mercados de rua. Entre as atrações de destaque, estão o futurista Dongdaemun Design Plaza, um salão de convenções com arquitetura curvada que tem um parque no telhado, o Palácio Gyeongbokgung, que já teve mais de 7.000 quartos, e o templo Jogyesa, local que abriga leguminosas e pinheiros antigos.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21)
        )
        val toquio = Viagem(
            id = 2,
            destino = "toquio",
            descricao = "Tóquio, a movimentada capital do Japão, combina o estilo ultramoderno com o tradicional, desde arranha-céus iluminados por neon a templos históricos. O opulento santuário xintoísta Meiji é conhecido por seu altíssimo portão e pelas florestas circundantes. O Palácio Imperial fica localizado em meio a jardins públicos. Os muitos museus da cidade oferecem exposições que variam de arte clássica (no Museu Nacional de Tóquio) a um teatro kabuki reconstruído (no Museu Edo-Tokyo).",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21)
        )
        val chile = Viagem(
            id = 2,
            destino = "chile",
            descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana. Seu centro abriga as sedes imponentes do Parlamento, a famosa torre do relógio do Big Ben e a Abadia de Westminster, local de coroação dos monarcas britânicos. Do outro lado do rio Tâmisa, a roda gigante London Eye tem vista panorâmica do complexo cultural da margem sul e de toda a cidade.",
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.chile)
        )
        return listOf(londres, alemanha, seul, toquio, chile)
    }
}