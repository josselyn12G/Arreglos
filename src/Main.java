import java.util.Arrays;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Definir el arreglo
        int[] numeros = new int[3]; // Es un objeto vector de tipo entero
        // int numeros[] = new int[3];

        // Definir una matriz
        int[][] matriz = new int[3][2];

        // Retorna un valor NULL porque no se ha definido primero el valor.
        System.out.println(numeros[0]);


        // Asignar en la posición ## los valores correspondientes.
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = -1;


        // Asignar a variables el contenido de cada posición.
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];

        // Imprimir
        System.out.println("i = " + numeros[0]); // Primera forma de imprimir
        System.out.println("j = " + j); // Otra forma de imprimir.
        System.out.println("k = " + k);

        // ¿Qué hace el VALUE OF?
        // Toma el valor y transforma al tipo de dato al que se utiliza.
        // Cuando estoy trabajando con CLASES.
        //numeros[1] = Integer.valueOf("2"); // Transformamos un caracter en un número.


        // Cuando quiero transformar NATIVOS utilizamos
        // numeros[1] = (int) 2L; // Estoy transformadno el long (4 Bytes) a un int de (2 Bytes).
        // Cuando quiero hacer una operación con otros tipos de datos que no son nativos debo especificar.



        /* PREGUNTAS DE EXAMEN
         1. Los vectores son estáticos porque yo establezco el tamaño del vector.
         2. Los vectores todos DEBEN SER EL MISMO TIPO DE DATO.
         */

        // Se puede AÑADIR POR UN ARREGLO, Con add o con otra lista


        // Creación de objeto de clase tipo String
        String[] productos = new String[3]; // El 3 es la magnitud del vector.
        productos[0] = "Memoria";
        productos[1] = "Samsung S2-3";
        productos[2] = "MacBook Air";
        // 0,1,2 son las posiciones.

        // Incluye una librería
        Arrays.sort(productos); // Ordenamiento directo de la cadena de caracteres
        // Ordena en  orden alfabético.


        for (int num = 0; num<=2; num++){
            System.out.println("Productos [" +num +"] = "+productos[num]);
        }

        // Es un vector de tipo int
        int[] numeros1 = {5, 3, 8, 2, 1};
        Arrays.sort(numeros1);  // Ordena el array en orden ascendente

        System.out.println("Array ordenado: " + Arrays.toString(numeros1));
        /* Arrays.toString convierte el array numeros1 en una representación de cadena legible
        * Salida: Array ordenado: [1, 2, 3, 5, 8] Incluye los corchetes para indicar el inicio y el fin del array.
        * Es un formato estándar. */
        

    }


}

/*
    Eliminar un elemento:
    1. temperaturas[2] = 0;
    2. listado[1] = null;


    Recorrer la estructura:
    Se utiliza array.length
    for (i = 0; i<= colores.length; i++){
        colores[i]. getNombre();
        colores[i];
    }

 */