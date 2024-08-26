## TEST DINAMIC MEMORY 






## OutOfMemoryError

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

si ejecutas directamente desde VS Code, agrega los parámetros en la configuración de launch.json:

```
{
    "configurations": [
        {
            "type": "java",
            "name": "Launch Program",
            "request": "launch",
            "mainClass": "com.example.Main",
            "vmArgs": "-Xms512m -Xmx1024m"
        }
    ]
}

```


### Vector performance analysis
2_000_000_000
Heap Size: 8024 MB
Max Heap Size: 8048 MB
Free Heap Size: 8019 MB
Duration time: 3504046300 NanoSecond
Duration time: 3504.0463  MilliSecond
Duration time: 3.5040463  Seconds


### Dynamic memory performance analysis



## size of object in java
Cálculo Aproximado del Tamaño de un Objeto
Vamos a desglosar el cálculo del tamaño aproximado para tu clase Node:

Tamaño de los Campos:

private int info;: Un entero (int) en Java ocupa 4 bytes.
private Node next;: Una referencia a un objeto (Node) generalmente ocupa 4 u 8 bytes, dependiendo de si la JVM está ejecutando en un sistema de 32 bits o 64 bits (respectivamente).
Overhead del Objeto:

En Java, cada objeto tiene un overhead para el encabezado del objeto, que incluye información de sincronización y de clase. El tamaño del encabezado puede ser de 8 bytes en una JVM de 64 bits con un puntero de 8 bytes y puede ser mayor si la JVM está configurada para usar el desplazamiento de objetos de 64 bits.
Ejemplo de Estimación
En una JVM típica de 64 bits, el tamaño de un objeto se calcula considerando el encabezado del objeto, el tamaño de los campos y el padding para la alineación.

1. Tamaño del Encabezado del Objeto:
Encabezado de objeto (aproximadamente 12 a 16 bytes en una JVM de 64 bits).
2. Tamaño de los Campos:
int info: 4 bytes.
Node next: 8 bytes (en una JVM de 64 bits).
3. Padding:
Los objetos deben estar alineados en la memoria, lo que puede agregar bytes adicionales para el padding.
Cálculo Aproximado:
plaintext
Copy code
Header: 12-16 bytes
int info: 4 bytes
Node next: 8 bytes
Padding: 0-4 bytes (para alineación)

Total: 12 (header) + 4 (info) + 8 (next) + 4 (padding) = 28 bytes (mínimo estimado)


## Utilizar una lista enlazada en lugar de un vector (o una estructura de datos similar, como un array)

 en Java tiene varias ventajas y desventajas, dependiendo del contexto y del uso que se le quiera dar a la estructura de datos. Aquí te detallo los pros y los contras de usar listas enlazadas frente a vectores.

### Ventajas de las Listas Enlazadas
- Inserciones y Eliminaciones Eficientes:

    - Listas Enlazadas: Las operaciones de inserción y eliminación en una lista enlazada (al menos si se tiene una referencia al nodo correcto) son muy eficientes, con una complejidad de tiempo de O(1). Esto se debe a que solo se necesita ajustar los punteros de los nodos afectados.

    - Vectores: Para vectores o arrays, insertar o eliminar elementos (especialmente en el medio de la estructura) puede ser costoso, ya que puede requerir mover muchos elementos para mantener el orden, con una complejidad de tiempo de O(n).

- Tamaño Dinámico:

    - Listas Enlazadas: Las listas enlazadas pueden crecer o decrecer dinámicamente sin necesidad de redimensionar la estructura, ya que cada nodo se crea y se enlaza según sea necesario.
    - Vectores: Los vectores o arrays deben ser redimensionados cuando se agota el espacio disponible. Esto implica la creación de un nuevo array más grande y la copia de los elementos, lo que puede ser costoso en términos de tiempo y memoria.

- Uso de Memoria para Inserciones:

    - Listas Enlazadas: No es necesario definir un tamaño máximo para la lista. La memoria se asigna solo cuando se crea un nuevo nodo.
    - Vectores: Puede haber un uso ineficiente de memoria si el vector no se usa completamente, o puede requerir redimensionamiento si se llena.

### Desventajas de las Listas Enlazadas
- Acceso aleatorio más lento:

    - Listas Enlazadas: Acceder a un elemento en una lista enlazada requiere recorrer la lista desde el inicio hasta el nodo deseado, con una complejidad de tiempo de O(n). Esto es menos eficiente comparado con el acceso directo a elementos en un vector.
    - Vectores: Los vectores permiten el acceso aleatorio en tiempo constante, O(1), ya que el acceso a cualquier elemento se realiza mediante un índice.
- Uso adicional de memoria:

    - Listas Enlazadas: Cada nodo en una lista enlazada requiere memoria adicional para almacenar los punteros (next en una lista enlazada simple), lo que puede ser significativo si la lista contiene muchos elementos.
    - Vectores: Los vectores no tienen este overhead de punteros y usan solo la memoria necesaria para los elementos.
- Complejidad en la Implementación:

    - Listas Enlazadas: Requieren más complejidad para implementar y mantener, ya que debes gestionar la creación y enlace de nodos manualmente.
    -  Vectores: Son más simples de implementar y usar, especialmente cuando se utilizan estructuras de datos de alto nivel proporcionadas por la biblioteca estándar.
### Resumen
- Ventajas de Listas Enlazadas:

    - Inserciones y eliminaciones eficientes (O(1)).
    - Crecimiento dinámico sin redimensionamiento.
    - No se requiere un tamaño máximo inicial.
- Desventajas de Listas Enlazadas:

    - Acceso aleatorio más lento (O(n)).
    - Mayor uso de memoria por punteros adicionales.
    - Implementación más compleja.
    
La elección entre listas enlazadas y vectores debe basarse en las necesidades específicas de la aplicación, como la frecuencia de inserciones/eliminaciones frente al acceso aleatorio y el uso eficiente de memoria.