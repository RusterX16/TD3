package dev.ruster.td3.ex;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public record NumberFrequency(Scanner scan) {

    public NumberFrequency(@NotNull final Scanner scan) {
        this.scan = scan;

        System.out.println(Arrays.toString(frequency(29562)));
        System.out.println(allDifferent(12892));
    }

    /*
    public int @Nullable [] numbersFrequency(int n) {
        int[] content = new int[n];

        boolean canBeDivided = true;
        int count = 0;

        while(canBeDivided) {
            if(n < 10) {
                canBeDivided = false;
            }
            n /= 10;
            count++;
        }

        int[] array = new int[count];

        System.out.println(Arrays.toString(array));
        return null;
    }
    */

    public int @NotNull [] frequency(int n) {
        int[] array = new int[NumberComponent.length(n)];
        int[] output = new int[10];
        Arrays.fill(output, 0);

        for(int i = 0; i < array.length; i++) {
            array[i] = n % 10;
            n /= 10;
        }

        for(int i = 0, z; i < array.length; i++) {
            z = array[i];

            if(array[i] == z) {
                output[z]++;
            }
        }
        return output;
    }

    public boolean allDifferent(int n) {
        int[] array = frequency(n);
        boolean different = true;

        for(int i : array) {
            if(i > 1) {
                different = false;
                break;
            }
        }
        return different;
    }
}