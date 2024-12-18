package com.lucas.voluntariado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
                    painter = painterResource(id = R.drawable.voluntario),
                    contentDescription = "Icono de voluntariado",
                    modifier = Modifier
                        .size(128.dp)
                        .padding(8.dp)
                )

                // Lista de tareas
                TaskList()
            }
        }
    )
}

@Composable
fun TaskList() {
    val tasks = listOf(
        "Reparto de alimentos" to "Ayuda en el banco de alimentos local.",
        "Limpieza de playas" to "Recogida de residuos en la playa principal.",
        "Donación de ropa" to "Entrega de ropa a familias necesitadas.",
        "Organización de eventos" to "Ayuda en la logística de eventos benéficos.",
        "Clases de apoyo" to "Apoyo escolar en centros comunitarios."
    )

    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        items(tasks) { (title, description) ->
            TaskItem(title, description)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun TaskItem(title: String, description: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = title, style = MaterialTheme.typography.titleLarge)
            Text(text = description, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
