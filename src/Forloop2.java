public class Forloop2 {
    public static void main(String[] args) {
        int ergebnis =0;
        for (int i=2; i<=1000; i+=2){
            ergebnis += i;
            System.out.println("alle zahlen " + ergebnis);

        }
        System.out.println("Ergebnis " + ergebnis);
    }
}
