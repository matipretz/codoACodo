package S2W;

public class S2 {
  public static int fichas = 1000;// Almacena de forma constante la cantidad de fichas del jugador.

  public static void main(String[] args) {
    System.out.println(S2WFunction.bienvenida);
    juego();
  }

  public static void juego() {
    while (true) {
      S2WFunction fun = new S2WFunction();
      fun.tomarNumero();
      fun.tomarFichas();
      fun.tirada();
      fun.opcionM();
    }
  }
}