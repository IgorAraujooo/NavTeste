package br.senai.sp.jandira.nav_ab.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun TelaHome(controleNavegacao: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF009688)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Bem vindo ao Home!",
                fontSize = 32.sp,
                color = Color.White
            )
            Button(onClick = {controleNavegacao.navigate("login")}) {
                Text(text = "Voltar ao Login!")
            }
        }

    }

}

@Preview
@Composable
fun TelaHomePreview() {
    //TelaHome(controleNavegacao)
}