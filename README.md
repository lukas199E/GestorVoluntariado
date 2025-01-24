# Gestor de Tareas

Aplicación Android para gestionar tareas utilizando Room y ViewModel.

## Cambios realizados

- **Corrección de la estructura del proyecto**: Se organizaron las clases en paquetes adecuados (`data`, `viewmodel`, `adapter`).
- **Uso de corrutinas**: Las operaciones de base de datos se realizan en segundo plano para evitar bloquear el hilo principal.
- **Verificación de datos**: Se agregaron logs y `Toast` para confirmar que los datos se guardan y recuperan correctamente.
- **Pruebas**: Se probó la aplicación en diferentes escenarios, como la rotación de pantalla y el cierre de la aplicación.

## Instrucciones

1. Clona el repositorio.
2. Abre el proyecto en Android Studio.
3. Ejecuta la aplicación en un emulador o dispositivo físico.
4. Ingresa un título y una descripción, luego presiona "GUARDAR".
5. Verifica que la tarea se muestra en la lista.

## Pruebas

- **Rotación de pantalla**: Verifica que los datos se mantienen después de rotar la pantalla.
- **Cierre de la aplicación**: Verifica que los datos persisten después de cerrar y reabrir la aplicación.

