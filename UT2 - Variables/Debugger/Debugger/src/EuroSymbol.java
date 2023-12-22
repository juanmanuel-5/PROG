import java.util.Scanner;

public class EuroSymbol {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 16;
        int suma = a + b;
        System.out.printf("Addition result: %d%s$€ 35%s",suma, "\u20AC", "€");
        System.out.print("\nEscribe día: ");
        Scanner sc = new Scanner(System.in);
        String diaStr = sc.nextLine();
        int dia;
        switch (diaStr.toLowerCase()) {
            case "1":
            case "lunes":
              dia = 1;
              break;
            default:
              dia = 0;
        }
        sc.close();
        System.out.printf("Dia: %d", dia);

    }
}
// poner antes en consola c:\> chcp 1252