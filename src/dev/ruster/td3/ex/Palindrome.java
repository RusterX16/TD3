package dev.ruster.td3.ex;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public record Palindrome(Scanner scan) {

    public Palindrome(@NotNull final Scanner scan) {
        this.scan = scan;

        System.out.println(isPalindrome());
    }

    @Contract(pure = true)
    public boolean _isPalindrome(char @NotNull [] array) {
        int size = array.length;
        char[] output = new char[size];

        for(int i = 0; i < size; i++) {
            output[size - i - 1] = array[i];
        }
        return Arrays.equals(output, array);

        /*
        String str = String.valueOf(array);
        return new StringBuilder(str).reverse().toString().equals(str);
        */
    }

    @Contract(pure = true)
    public boolean isPalindrome() {
        System.out.print("Donner un mot : ");
        String str = scan.next().toUpperCase();
        char[] array = new char[str.length()];
        boolean equals = true;

        for(int i = 0; i < array.length; i++) {
            array[i] = str.charAt(i);
        }
        char[] output = array.clone();

        for(int i = 0; i < str.length(); i++) {
            output[str.length() - i - 1] = array[i];
        }

        for(int i = 0; i < array.length; i++) {
            if(output[output.length - i - 1] == array[i]) {
                equals = false;
                break;
            }
        }
        return equals;

        /*
        String str = String.valueOf(array);
        return new StringBuilder(str).reverse().toString().equals(str);
        */
    }
}