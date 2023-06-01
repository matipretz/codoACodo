import java.util.Scanner;

public class B_Desafio {

     public static void desafio2() {
          Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese su calificacion y presione [ENTER]");
          int cal = sc.nextInt();
          if(cal >= 0 && cal <= 4) {
               System.out.print("Suspenso");
          }
          else if(cal==5)     {
               System.out.print("Aprobado");
          }
          else if(cal==6)     {
               System.out.print("Bien");
          }else if(cal==7||cal==8) {
               System.out.print("Notable");
          }
          else if(cal==9)     {
               System.out.print("Sobresaliente");
          }
          else if(cal==10)    {
               System.out.print("Matricula de Honor");
          }
          else if(cal<0||cal>10)   {
               System.out.print("Dato incorrecto\n");
          }
          sc.close();
     }
}