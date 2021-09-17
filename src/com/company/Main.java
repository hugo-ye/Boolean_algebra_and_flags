package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static int homework3() {
        int count = 1;
        while (true) {
            if (count % 387 == 0 && count % 6381 == 0) {
                return count;
            }
            count += 1;
        }

    }

    public static boolean homework4(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }
}

