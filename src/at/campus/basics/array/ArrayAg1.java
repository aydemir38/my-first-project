package at.campus.basics.array;

public class ArrayAg1 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 6, 8, 10, 14, 16, 17, 19,};
        int summe = 0;
/*
       for (int number : numbers){
            summe = summe + number;
           System.out.println("number " +number);
           System.out.println( summe);
        }
        System.out.println("summe : " + summe);
*/
        int i = 0;
        while (i < numbers.length) {

            summe = summe + numbers[i];
            System.out.println("summe " + summe);
            i++;


            System.out.println(i);
        }

    }

}
