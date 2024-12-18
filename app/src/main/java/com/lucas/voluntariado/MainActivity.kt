package com.lucas.voluntariado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.lucas.voluntariado.ui.theme.GestorVoluntariadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestorVoluntariadoTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Gestor de Voluntariado") }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Texto principal
                Text(
                    text = "Bienvenido al gestor de tareas para voluntariado",
                    modifier = Modifier.padding(16.dp)
                )

                // Imagen
                Image(
                    painter = painterResource(id = R.drawable.voluntario), // Nombre de tu imagen
                    contentDescription = "Icono de voluntariado",
                    modifier = Modifier
                        .size(128.dp)
                        .padding(8.dp)
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    GestorVoluntariadoTheme {
        MainScreen()
    }
}
