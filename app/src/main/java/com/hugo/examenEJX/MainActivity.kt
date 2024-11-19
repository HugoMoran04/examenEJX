package com.hugo.examenEJX

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hugo.examenEJX.ui.theme.ExamenEJXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenEJXTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)

                    )
                }
            }
        }
    }
}
/*
Objetivo: Crear una pantalla que muestre una lista de videojuegos, cada uno con una imagen,
un nombre y un precio.
Pasos:
1. Define una data class con name, price y imageUrl.
2. Usa LazyColumn para mostrar la lista de productos.
3. Cada elemento de la lista debe mostrar una AsyncImage, un Text para el nombre de
mayor tamaño y otro Text para el precio.
4. La imagen de cada uno se obtendrá de
https://loremflickr.com/400/400/seville?lock=1, cambiando el número para que sean
distintas.
Dependencias:
coil = { group = "io.coil-kt", name = "coil-compose", version.ref = "2.2.2" }*/

data class Game(val name: String, val price: Double, val imageUrl: String)

@Composable
fun GameList(games: List<Game>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(games) { game ->
            GameItem(game)
            Spacer(modifier = Modifier.height(16.dp))
        }

    }
}


/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/
/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExamenEJXTheme {
        Greeting("Android")
    }
}*/