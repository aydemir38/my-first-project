package at.campus.basics.Quersumme;

public class QuersummeAufgabe1 {
    public static void main(String[] args) {
//        Gib alle Zahlen zwischen 0 und 1000 aus, welche eine Quersumme von 15 haben.
//
//                Beispiel: die Quersumme von 253 ist 2 + 5 + 3 = 10

        int sum = 0;

        for (int number = 0; number <= 1000; number++) {


            int number1 = number;

            int total = 0;

            while (number1 > 0) {
                int lastValue = number1 % 10;

                total += lastValue;

                number1 = number1 / 10;

            }


            if (total == 15) {

                sum++;
                System.out.println("Schleifennummer: " + number + " Quersumme: " + total);
                System.out.println("Es wurden: " + sum + " Durchgänge absolviert!");
            }


        }
    }
}
