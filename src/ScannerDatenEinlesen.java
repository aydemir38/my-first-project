import java.util.Scanner;

public class ScannerDatenEinlesen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben:");
        double num1 = scan.nextDouble();
        System.out.println("Ihre Eingegebene Zahl lautet: " + num1);

        System.out.println("bitte zweite Zahl eingeben");
        double num2 = scan.nextDouble();
        System.out.println("Ihre zweite Zahl: "+ num2);

        double result = num1 + num2;
        System.out.println("Ihre ergerbnis ist: "+result);
    }
}
