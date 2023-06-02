package desafios;

import java.util.Arrays;
import java.util.Scanner;

public class D_Desafio {
    public static void desafio4() {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];

        /*
         * #############################################################################
         * ##
         * Desafío de clase - 1
         * ● Hacer un array que me permita la carga por teclado de
         * 10 notas de clases, terminada la carga arrojará, las notas
         * cargadas y el promedio de ellas.
         * #############################################################################
         * ##
         */
        System.out.println("Bienvenido. Ingrese notas:");
        double sum = 0;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = sc.nextInt();
            sum += arreglo[i];
        }

        System.out.println("Arreglo: " + Arrays.toString(arreglo));
        System.out.println("Suma: " + sum);
        System.out.println("Primedio: " + sum / arreglo.length);

        /*
         * #############################################################################
         * ##
         * Desafío de clase - 2
         * ● Programar una aplicación que utilice un arraylist
         * para cargar un listado de cosas a comprar en el
         * supermercado.
         * ● Permitir al usuario cargar en un buscador el
         * producto y si el producto está en el listado que
         * arroje un aviso “Si, tenés que comprar el producto”
         * #############################################################################
         * ##
         */

        /*
         * #############################################################################
         * ##
         * Desafío de clase 3
         * ● Hacer un array que me permita la carga por teclado el
         * tamaño del arreglo, luego cargar datos, terminada la
         * carga arrojará, los datos cargados.
         * 
         * https://app.codingrooms.com/w/8sZ6zg6rD4FY
         */
        sc.close();
    }
}