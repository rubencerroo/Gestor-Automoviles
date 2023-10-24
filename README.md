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

## Captura De El Programa


https://github.com/rubencerroo/Gestor-Automoviles/assets/119308526/d46cefb7-f017-476f-83b0-a5c0691a7a9b



## Notas Adicionales

- Los archivos generados (archivos binarios y documentación) se almacenan en las carpetas `bin` y `doc`.

Los diagramas UML que visualiza en este programa se generan automáticamente (con un programa propio) a partir de los archivos .java y no han sido revisados manualmente. Por lo tanto, tenga en cuenta lo siguiente:

1. Los diagramas UML se generan con fines ilustrativos y pueden contener errores, omisiones o representaciones incompletas de la estructura y relaciones del sistema.

2. La precisión de la información en los diagramas UML depende de la exactitud de los datos de entrada y la implementación del programa. Pueden producirse discrepancias entre la realidad y los diagramas generados.

3. Se recomienda utilizar los diagramas UML como una referencia inicial y no como la única fuente de información sobre la arquitectura del sistema. En caso de duda o para una comprensión precisa, consulte con rubencerroo

Estos diagramas UML son proporcionados "tal cual" y no se garantiza su exactitud o idoneidad para ningún propósito específico. El uso de esta información está bajo su propia responsabilidad.

¡Gracias por su comprensión y precaución al utilizar los diagramas UML generados automáticamente!

## LICENSE
   Copyright 2023 rubencerroo
   
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
   
   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
