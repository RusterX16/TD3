package dev.ruster.td3.ex;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public record Triangle(Scanner scan) {

    public Triangle(@NotNull final Scanner scan) {
        this.scan = scan;

        System.out.print("Périmètre : ");
        System.out.println("Trianges : " + (triangle(scan.nextInt())));
    }

    public int triangle(int n) {
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(Math.pow(i + 1, 2) + Math.pow(j + 1, 2) == Math.pow(k + 1, 2)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}