import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Курсовая работа (Введение в профессию и в синтаксис языка)");

        System.out.println("Билет № 2");

        //****************************************************
        // Ответы на вопросы
        //****************************************************

        int a = 10;
        int b = 12;
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }

        String str = "ASD";

        switch (str) {
            case "ASD":
                System.out.println("Yeah!");
                break;
            case "sds":
                System.out.println(str);
                break;
            default:
                System.out.println("No!");
        }

        int result = a > b ? a - b : a + b;
        System.out.println(result);

        int[] arr = new int[3]; // 0 0 0
        int[] arr2 = {4, 2, 9};

        for (int i = 0; i < arr.length; i++){
            arr[i] = i * i;
        }

        for (int number :
                arr2) {
            System.out.println(number);
        }

        SetterClass sc = new SetterClass();

        sc.setA(34);
        sc.setString("Hello");

        System.out.println(sc.getA());
        System.out.println(sc.getString());
        System.out.println();

        //********************************************************
        // Решение задачи
        //********************************************************

        String pal = "А роза упала на лапу Азора";
        if (isPalindrome2(pal)) {
            System.out.printf("%s - palindrome", pal);
        } else {
            System.out.printf("%s - not palindrome", pal);
        }

        System.out.println();

        //********************************************************
        // Palindrome 3
        //********************************************************
        String string = "вовсов";
        if (isPalindrome3(string)) {
            System.out.printf("%s - palindrome", string);
        } else {
            System.out.printf("%s - not palindrome", string);
        }

    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\W", "");

        char[] ch1 = str.toCharArray();
        char[] ch2 = new char[ch1.length];

        for (int i = ch1.length - 1; i >= 0; i--) {
            ch2[ch1.length - 1 - i] = ch1[i];
        }
        return Arrays.equals(ch1, ch2);
    }

    public static boolean isPalindrome2(String str) {
        return str.replaceAll("\\W", "").equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W", "")).reverse().toString());
    }

    private static boolean isPalindrome3(String str) {
        boolean isPalindrome = false;

        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                isPalindrome = true;
                System.out.println(str.charAt(i) + " " + str.charAt(str.length() - 1 - i));
            } else {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}