public class Spin2Win {
  public static int fichas = 1000;// Almacena de forma constante la cantidad de fichas del jugador.

  public static void main(String[] args) {
    juego();
  }

  public static void juego() {
    S2WFunction fun = new S2WFunction();
    while (true) {
      fun.tomarNumero();
      fun.tomarFichas();
      fun.tirada();
      fun.opcionM();
    }
  }
}