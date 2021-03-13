package at.campus.basics.array;

public class ReCapDemo {
    public static void main(String[] args) {

        double[] myList = {1.2, 2.4, 7.8, 4.9, 6.3, 3.8};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            System.out.println("number: " + number);
            total = total + number;
        }
        System.out.println("total : " + total);
        System.out.println("max : " + max);
 /*
        for (int i=0;i< myList.length;i++) { // wieso double geht nicht ?

            if (max < myList[i]) {
                max =myList[i];
            }
            System.out.println("number: " + myList[i]);
            total = total + myList[i];
        }
        System.out.println("total : " + total);
        System.out.println("max : " + max);
*/
    }
}

