package dev.ruster.td3.ex;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public record Triangle(Scanner scan) {

    public Triangle(@NotNull final Scanner scan) {
        this.scan = scan;
    }

    public void triangle(int n) {
        int adj = 1;
        int opp = 1;
        double hyp = Math.sqrt(adj * adj + opp * opp);
        boolean hasNext = true;

        while(hasNext) {
            if(adj + opp + hyp < n) {
                hasNext = false;
            }
            adj++;
            opp++;
        }

    }
}