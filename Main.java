package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Inserisci il valore del reddito : ");
            int amount = input.nextInt();
            double tax = 0;
            if (amount <= 0) {
                System.out.println("Inserisci un valore maggiore di 0 ");
                continue;
            }
            if (amount <= 10000) {
                tax = amount * 0.1;
            } else if (amount <= 20000) {
                tax = 1000 + (amount - 10000) * 0.07;
            } else if (amount <= 30000) {
                tax = 1700 + (amount - 20000) * 0.05;
            } else {
                tax = 2200 + (amount - 30000) * 0.03;
            }
            System.out.println("La tassa è di : " + tax + " $");
            System.out.println("Se vuoi calcolare un altra operazione premi 0");
            int response = input.nextInt();
            if (response != 0) {
                break;
            }
        }
    }
}
