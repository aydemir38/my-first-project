
import java.util.Random;
import java.util.Scanner;

public class if_Bedingung {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        // Gib die Zufallszahl aus
        System.out.println(randomNumber);
        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        if (randomNumber < 20) {
            System.out.println("mini");
        } else if (randomNumber >= 20 && randomNumber < 50) {
            System.out.println("medium");
        } else if (randomNumber > 50) {
            System.out.println("large");
        } else {
            System.out.println("nonsense number");
        }






        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        if (inputNumber < 20) {
            System.out.println("mini");
        } else if (inputNumber >= 20 && inputNumber < 50) {
            System.out.println("medium");
        } else if (inputNumber > 50) {
            System.out.println("large");
        } else {
            System.out.println("nonsense number");
        }


        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"
    }
}
