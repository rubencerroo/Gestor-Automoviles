# Catalogo de Automóviles

## Descripción
Este programa de gestión de catálogo de automóviles te permite agregar, eliminar y listar automóviles. Además, guarda automáticamente el catálogo en un archivo, lo que te permite retomar tu trabajo donde lo dejaste.

## Funcionalidades

### Para Usuarios
- **Agregar Automóvil:** Puedes agregar un automóvil especificando su marca, modelo, año y precio. El programa generará automáticamente una referencia única para cada automóvil.

- **Eliminar Automóvil:** Puedes eliminar un automóvil utilizando su referencia. Esto evita confusiones si varios automóviles tienen caracteristicas iguales.

- **Listar Automóviles:** Puedes ver la lista completa de automóviles en tu catálogo, incluyendo su referencia.

### Para Desarrolladores
- El proyecto está estructurado en paquetes (`main` y `dominio`) para mantener un código limpio y organizado.

- Se utiliza un archivo Manifest para especificar la clase principal del programa al crear el archivo JAR.

- Se generan archivos Javadoc para documentar el código. Puedes generar la documentación utilizando el comando `make javadoc`.

## Requisitos
- Java Development Kit (JDK) 8 o superior.

## Instrucciones de Uso
1. Clona este repositorio o descarga los archivos del proyecto.

2. Compila el programa utilizando el comando `make compile`.

3. Ejecuta el programa con `java -jar CatalogoAutomoviles.jar`.

4. Sigue las opciones del menú para gestionar tu catálogo de automóviles.

5. Los cambios se guardarán automáticamente en un archivo `catalogo.ser`.

## Comandos Makefile
- `make compile`: Compila los archivos fuente.
- `make jar`: Crea un archivo JAR ejecutable.
- `make javadoc`: Genera la documentación Javadoc.
- `make clean`: Limpia los archivos generados.

## Notas Adicionales
- Asegúrate de crear un archivo de Manifest (`manifest.mf`) para el archivo JAR.

- Los archivos generados (archivos binarios y documentación) se almacenan en las carpetas `bin` y `doc`.

- Si deseas modificar el programa, recuerda mantener la estructura de paquetes.

¡Disfruta de la gestión de tu catálogo de automóviles!
