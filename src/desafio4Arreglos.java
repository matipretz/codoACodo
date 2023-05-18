import java.util.Scanner;

public class Desafio4Arreglos {
    public static void def4() {
        System.out.println("############################### Arreglos ######################################");
        System.out.println("#                                                                             #");
        System.out.println("# 1. Completar los desafios de clase                                          #");//falta
        System.out.println("#                                                                             #");
        System.out.println("###############################################################################\n");
        Scanner sc = new Scanner(System.in);

        /*
        Desafío de clase - 1
        ● Hacer un array que me permita la carga por teclado de
        10 notas de clases, terminada la carga arrojará, las notas
        cargadas y el promedio de ellas.
        
        Desafío de clase - 2
        ● Programar una aplicación que utilice un arraylist
        para cargar un listado de cosas a comprar en el
        supermercado.
        ● Permitir al usuario cargar en un buscador el
        producto y si el producto está en el listado que
        arroje un aviso “Si, tenés que comprar el producto”

        Desafío de clase 3
        ● Hacer un array que me permita la carga por teclado el
        tamaño del arreglo, luego cargar datos, terminada la
        carga arrojará, los datos cargados.

        https://app.codingrooms.com/w/8sZ6zg6rD4FY
        */

        System.out.println("Presiona [Enter] para volver al menu principal.");
        sc.nextLine();
        sc.close();
        Menu.menu();
    }
}