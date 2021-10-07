package dev.ruster.td3.ex;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public record Palindrom(Scanner scan) {

    public Palindrom(Scanner scan) {
        this.scan = scan;
        System.out.println(isPalindrom(new char[]{'K', 'A', 'Y', 'A', 'K'}));
    }

    @Contract(pure = true)
    public boolean isPalindrom(char @NotNull [] array) {
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
}