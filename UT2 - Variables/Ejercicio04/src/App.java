public class App {
  public static void main(String[] args) {
    System.out.print("\033[33m");
    System.out.printf("%-12s    %-8s    %-8s\n", "HORARIO", "LUNES", "MARTES");
    System.out.print("\033[94m");
    System.out.printf("%-12s    %-8s    %-8s\n", "15'15-16'15", "PROG", "LMAR");
    System.out.printf("%-12s    %-8s    %-8s\n", "16'15-17'15", "PROG", "LMAR");
    System.out.printf("%-12s    %-8s    %-8s\n", "17'15-18'15", "EDES", "LMAR");
    System.out.printf("%-12s    %-8s    %-8s\n", "18'15-19'15", "EDES", "LMAR");
    System.out.printf("%-12s    %-8s    %-8s\n", "19'15-20'15", "EDES", "LMAR");
    System.out.print("\033[37m");    
    System.out.printf("hola %s," + " adiós %s", "Pepe", "Jose");
  }
}
