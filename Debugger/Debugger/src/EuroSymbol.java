public class EuroSymbol {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 16;
        int suma = a + b;
        System.out.printf("Addition result: %d%s$€",suma, "\u20AC");
    }
}
// poner en consola >chcp 1252