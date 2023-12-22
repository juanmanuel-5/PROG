import java.util.Random;
public class Aleatorio {
    public static void main(String[] args) {
        // Random rand = new Random();
        // int ran = rand.nextInt(17);
        // ran++;
        int ran = (int)(Math.random()*3)-1;
        System.out.printf("Número de alumno: %d\n", ran);
    }
}
