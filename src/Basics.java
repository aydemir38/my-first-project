public class Basics {
    public static void main(String[] args) {
        System.out.println("hallo");

// AUFGABE 1
        int nummer1 = 1;
        int nummer2 = 5;
        int result = nummer1 + nummer2;
        System.out.println(result);


        int amount = 10;
        int size = 2;
        int result1 = amount * size;
        System.out.println(result1);
            // AUFGABE 2
        String banana = "Banane";
        String apple = "Apple";
        double bananaPricePerKilo = 2.14;
        double applePricePerKilo = 3.43;
        double appleDurchschnittKilo = 0.34;
        double bananaDurchschnittKilo = 0.22;
        double anzahlbanane = 1 / bananaDurchschnittKilo;
        System.out.println("Anzahl Banane " + anzahlbanane);
        double anzahlapple = 1 / appleDurchschnittKilo;
        System.out.println("Anzahl Apple " + anzahlapple);
        double preisProBanane = bananaPricePerKilo * bananaDurchschnittKilo;
        System.out.println("Preis pro Banane " + preisProBanane);
        double preisProApple = applePricePerKilo * appleDurchschnittKilo ;
        System.out.println("Preis pro Apple " + preisProApple);
        double preisVon8Apple = preisProApple * 8 ;
        System.out.println( "Preis von 8 Apple " + preisVon8Apple);
        double preisVon17Banane = preisProBanane * 17 ;
        System.out.println("Preis von 17 Banane " + preisVon17Banane);
        double preisEinsTonneApple = applePricePerKilo * 1000 ;
        System.out.println("Preis 1 tonne Apple " + preisEinsTonneApple);
        double preisEinsTonneBanane = bananaPricePerKilo * 1000 ;
        System.out.println("Preis 1 tonne Banane " + preisEinsTonneBanane);








    }


}