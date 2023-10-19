import java.util.Random;
public class Aleatorio {
    public static void main(String[] args) {
        Random rand = new Random();
        int ran = rand.nextInt(20);
        ran++;
        System.out.printf("Número de alumno: %d\n", ran);
    }
}
