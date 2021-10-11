package dev.ruster.td3.ex;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public record Exponential(Scanner scan) {

    public Exponential(@NotNull final Scanner scan) {
        this.scan = scan;
        System.out.println(getExponential(1));

        System.out.println();
    }

    public double getExponential(int n) {
        double exp = Math.exp(1);

        System.out.println(exp);

        if(n > 0) {
            for(int i = 0; i < n; i++) {
                
            }
        }
        return exp;
    }
}