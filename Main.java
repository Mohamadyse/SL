package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            int s = sc.nextInt();
            sum += (double) s / 60 / m;
        }
        Double average = sum / n;
        if (average <= 1) {
            System.out.println("measurement error");
        } else {
            System.out.println(average);
        }
    }
}
