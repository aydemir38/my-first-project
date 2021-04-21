package String;

public class AufgabeUmkehrungEins {
    public static void main(String[] args) {
//        copyStringInverted();
        String reverted = getReverseString("endlich");
        System.out.println(reverted);
    }

    private static void copyStringInverted() {
        String text = "katze";
        char[] input = text.toCharArray();
        char[] result = new char[input.length];


        int length = text.length() - 1;
        for (int i = text.length() - 1; i >= 0; i--) {


            result[length - i] = input[i];

        }
        System.out.println(result);

        for (int i = input.length - 1; i >= 0; i--) {
            input[length - i] = result[i];

        }
        System.out.println(input);
    }

    public static String getReverseString(String text){
    String result="";
        for (int i = text.length() - 1; i >= 0; i--){
            result=result+text.charAt(i);
        }
        return result;
    }

}

