package edu.ucne.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.magnifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.ucne.banderas.ui.theme.BanderasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BanderasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Banderas()
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Banderas() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            Spacer(modifier = Modifier.padding(20.dp)) //Espacio
            BanderaCanada(modifier = Modifier.padding(0.dp)) //Bandera de Canadá

            Spacer(modifier = Modifier.padding(20.dp)) //Espacio
            BanderaIndia(modifier = Modifier.padding(0.dp)) //Bandera de India

            Spacer(modifier = Modifier.padding(20.dp)) //Espacio
            BanderaDominicana(modifier = Modifier.padding(0.dp)) //Bandera de República Dominicana
        }
    }
}

@Composable
fun BanderaCanada(modifier: Modifier) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .size(74.dp, 140.dp)
                    .background(color = Color.Red)
            )
            Box(
                modifier = Modifier
                    .size(80.dp, 140.dp)
                    .background(color = Color.White)
            )
            Box(
                modifier = Modifier
                    .size(74.dp, 140.dp)
                    .background(color = Color.Red)
            )

        }
        Text(text = " Canadá",
            modifier = Modifier.
            background(color = Color(0xFFFFFFFF)))
    }
}

@Composable
fun BanderaIndia(modifier: Modifier) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .size(228.dp, 60.dp)
                    .background(color = Color(0xFFFF7A22))
            )
        }
        Row {
            Box(
                modifier = Modifier
                    .size(228.dp, 60.dp)
                    .background(color = Color.White)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                }
            }
        }
        Row {
            Box(
                modifier = Modifier
                    .size(228.dp, 60.dp)
                    .background(color = Color(0xFF1D5816))
            )
        }
        Text(text = " India",
            modifier = Modifier
                .background(color = Color(0xFFFFFFFF)))
    }
}

@Composable
fun BanderaDominicana(modifier: Modifier) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .size(100.dp, 60.dp)
                    .background(color = Color.Blue)
            )
            Spacer(modifier = Modifier.padding(14.dp))
            Box(
                modifier = Modifier
                    .size(100.dp, 60.dp)
                    .background(color = Color.Red)
            )
        }

        Spacer(modifier = Modifier.padding(14.dp)) //Espacio horizontal

        Row() {
            Box(

                modifier = Modifier
                    .size(100.dp, 60.dp)
                    .background(color = Color.Red)
            )
            Spacer(modifier = Modifier.padding(14.dp))
            Box(
                modifier = Modifier
                    .size(100.dp, 60.dp)
                    .background(color = Color.Blue)
            )
        }
        Text(
            text = " República Dominicana",
            modifier = Modifier
                .background(color = Color(0xFFFFFFFF))
        )
    }
}



