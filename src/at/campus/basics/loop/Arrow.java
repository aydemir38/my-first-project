package at.campus.basics.loop;

public class Arrow {
    public static void main(String[] args) {


        String stern = "*";

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                //System.out.print("Zeile" + i + " Sterne" + j + " " + stern + " ");
                System.out.print(stern);
            }
            System.out.println();

        }

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(stern);
            }
            System.out.println();

        }

        System.out.println("new Method ....");

        myRepeat();

    }


    public static void myRepeat() {
        int i = 1;
        String x = "*";
        while (i<=5) {
            System.out.println(x.repeat(i));
            i++;
        }
        System.out.println(i);
        while (i>=1) {
            System.out.println(x.repeat(i));
            i--;
        }

    }



}



