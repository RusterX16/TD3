package dev.ruster.td3;

import dev.ruster.td3.ex.*;

import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.print("Choisir un exercice (0 pour quitter) : ");
            int choice = scan.nextInt();

            switch(choice) {
                case 0 -> System.exit(0);
                case 1 -> new ArrayProcess(scan);
                case 2 -> new TreeNumberMax(scan);
                case 3 -> new NumberComponent(scan);
            }
        }
    }
}