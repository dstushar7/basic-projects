package com.dstushar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        int firstElement = 0, secondElement = 1;

        Scanner takeInput = new Scanner(System.in);
        number = takeInput.nextInt();

        while (number<=firstElement){
            int temp = secondElement;
            secondElement = firstElement+secondElement;
            firstElement = secondElement;
            if (firstElement==number || secondElement==number){
                System.out.println("Fibonacci Number");
                System.exit(0);
            }
        }
        System.out.println("Not Fibonacci Number");
    }
}
