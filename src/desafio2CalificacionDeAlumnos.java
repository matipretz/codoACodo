
/******************************************************************************
CAC INICIAL JAVA 2023
Murad Pretz Matias Martin
DNI:33366158
Comision: 23438

DESAFIO 2:

Para mostrar la calificacion de un alumno, es necesario evaluar las condiciones que se indican en la siguiente tabla.

Calificacion   Mostrar por consola
10              Matricula de Honor
9               Sobresaliente
7,8             Notable
6               Bien
5               Aprobado
0,1,2,3,4       Suspenso
*******************************************************************************/
import java.util.Scanner;

public class CalificacionDeAlumnos {
     Scanner sc = new Scanner(System.in);
     System.out.println("Ingrese su calificacion y presione [ENTER]");
     int cal = sc.nextInt();if(cal>=0&&cal<=4)
     {
          System.out.print("Suspenso");
     }else if(cal==5)
     {
          System.out.print("Aprobado");
     }else if(cal==6)
     {
          System.out.print("Bien");
     }else if(cal==7||cal==8)
     {
          System.out.print("Notable");
     }else if(cal==9)
     {
          System.out.print("Sobresaliente");
     }else if(cal==10)
     {
          System.out.print("Matricula de Honor");
     }else if(cal<0||cal>10)
     {
          System.out.print("Dato incorrecto\n");
     }
}
