package dev.ruster.td3.ex;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public record NumberFrequency(Scanner scan) {

    public NumberFrequency(Scanner scan) {
        this.scan = scan;
        numbersFrequency(2956);
    }

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
}