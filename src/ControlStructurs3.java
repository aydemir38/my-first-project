import java.util.Random;

public class ControlStructurs3 {
    public static void main(String[] args) {


       int summe = 0;

        boolean result = true;
        while (result) {

            Random random = new Random();
            int randomNumber = random.nextInt( 30 - 10  ) + 10;

            summe = summe + randomNumber;

            System.out.println(randomNumber);
            if (randomNumber == 15 || randomNumber == 25) {
                result = false;
            }


        }

        System.out.println("Programm Ende - Summe:" + summe);

    }
}



