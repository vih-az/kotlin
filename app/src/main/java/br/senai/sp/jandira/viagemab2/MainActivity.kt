package br.senai.sp.jandira.viagemab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.viagemab.R
import br.senai.sp.jandira.viagemab2.repositorio.ViagemRepositorio
import br.senai.sp.jandira.viagemab2.ui.theme.ViagemAbTheme
import br.senai.sp.jandira.viagemab2.utilitarios.encurtadorDeDatas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViagemAbTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier){
    val viagens = ViagemRepositorio().listarTodasAsViagens()
    LazyColumn{
        items(viagens){
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 4.dp)
            ){
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(170.dp)
                ){
                    Image(
                        painter = if (it.imagem == null)
                            painterResource(id = R.drawable.noimageavailable)
                        else it.imagem!!,
                        contentDescription = " ",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(text = "${it.destino}, ${it.dataChegada.year}")
                Text(text = it.descricao)
                Text(
                    text = encurtadorDeDatas(it.dataChegada, it.dataPartida)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ViagemAbTheme {
        Greeting("Android")
    }
}