# Catalogo de Automóviles Con Herencia e interfaz Grafica

## Descripción
Este programa de gestión de catálogo de automóviles te permite agregar, eliminar y listar automóviles. Además, guarda automáticamente el catálogo en un archivo serializado, lo que te permite retomar tu trabajo donde lo dejaste de forma segura.

## Funcionalidades

### Para Usuarios
- **Agregar Automóvil:** Puedes agregar un automóvil especificando su marca, modelo, año y precio (Mas posibilidades para distintos tipos de Automovil).El programa generará automáticamente una referencia única para cada automóvil.

- **Eliminar Automóvil:** Puedes eliminar un automóvilhaciendo Doble-Click sobre el mismo. Esto evita confusiones si varios automóviles tienen caracteristicas iguales.

- **Listar Automóviles:** Puedes ver la lista completa de automóviles en tu catálogo, incluyendo su referencia.

### Para Desarrolladores
- El proyecto está estructurado en paquetes (`main`, `dominio` y `interfaz`) para mantener un código limpio y organizado.

- Se utiliza un archivo Manifest para especificar la clase principal del programa al crear el archivo JAR.

- Se generan archivos Javadoc para documentar el código. Puedes generar la documentación utilizando el comando `make javadoc`.

## Requisitos
- Java Development Kit (JDK) 8 o superior.

## Instrucciones de Uso
1. Clona este repositorio o descarga los archivos del proyecto.
   ```console
   git clone https://github.com/rubencerroo/Gestor-Automoviles.git
   ```
2. Muevete a la carpeta descargada:
   ```console
   cd Gestor-Automoviles
   ```
3. Muevete a la carpeta GestorAutomovil
   ```console
   cd GestorAutomovil
   ```
4. Si es la primera vez que quieres ejecutar el programa haz:
   ```console
   make completo
   ```
    Esto hara un clean, compile,jar,javadoc,run.
   
5. Sigue las opciones del menú para gestionar tu catálogo de automóviles.

6. Los cambios se guardarán automáticamente en un archivo `catalogo.ser`.
7. La proxima vez puedes simplemente ejecutar el programa haciendo:
   ```console
   make run
   ```

## Comandos Makefile
- `make compile`: Compila los archivos fuente.
- `make jar`: Crea un archivo JAR ejecutable.
- `make javadoc`: Genera la documentación Javadoc.
- `make clean`: Limpia los archivos generados.
- `make run`: Ejecutar el jar del programa.
- `make completo`: Ejecuta todos los anteriores para que el programa funcione correctamente.

## Diagrama UML
![UMLDiagram](https://github.com/rubencerroo/Gestor-Automoviles/assets/119308526/69387eca-7e1e-48df-b4c3-b422bd8aac18)



## Notas Adicionales

- Los archivos generados (archivos binarios y documentación) se almacenan en las carpetas `bin` y `doc`.

