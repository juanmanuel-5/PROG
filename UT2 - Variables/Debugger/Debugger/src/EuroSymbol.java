public class EuroSymbol {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 16;
        int suma = a + b;
        System.out.printf("Addition result: %d%s$€ 35%s",suma, "\u20AC", "€");
    }
}
// poner antes en consola c:\> chcp 1252