package String;

import java.util.Scanner;

public class AufgabeUmkehrung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next().toUpperCase();
        System.out.println(text);

        String reverseString = getReverseString(text);
        System.out.println(reverseString);

        String originalString = getReverseString(reverseString);
        System.out.println(originalString);

        String reverseString1 = getReverseString2(originalString);
        System.out.println(reverseString1);

        String originalString1 = getReverseString2(reverseString1);
        System.out.println(originalString1);

    }
// zweite möglichkeit
    public static String getReverseString2(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }


    public static String getReverseString(String text) {
        char[] input = text.toCharArray();
        char[] result = new char[input.length];

        int length = text.length() - 1;
        for (int i = text.length() - 1; i >= 0; i--) {
            result[length - i] = input[i];
        }
        return String.valueOf(result);
    }

}

