package org.example;

public class PrimeNumberCounter {


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2, limit = (int) Math.sqrt(num); i <= limit; i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public static int countPrimes(int max) {
        if (!isValidRange(max)) {
            return 0; 
        }

        int count = 0;
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static int sumPrimes(int max) {
        if (!isValidRange(max)) {
            return 0; 
        }

        int sum = 0;
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static void printCount(int max) {
        int count = countPrimes(max);
        System.out.println("Hej, det finns " + count + " primtal mellan 0 och " + max + "!");
    }

    public static void printSum(int max) {
        int sum = sumPrimes(max);
        System.out.println("Och den totala summan av dessa primtal är " + sum + ".");
    }

    public static boolean isValidRange(int max) {
        if (max < 0 || max > 1000) {
            System.out.println("Hoppsan, fel intervall angivet! Vänligen ange ett värde mellan 0 och 1000.");
            return false;
        }
        return true;
    }

    
    public static void main(String[] args) {
        int max = 1000; 

        if (isValidRange(max)) {
            printCount(max);
            printSum(max);
        }
    }
}

        int sum = sumPrimes(max);
        return "Och den totala summan av dessa primtal är " + sum + ".";
    }

    public static boolean isValidRange(int max) {
        if (max < 0 || max > 1000) {
            System.out.println("Hoppsan, fel intervall angivet! Vänligen ange ett värde mellan 0 och 1000.");
            return false; // Out of valid range
        }
        return true;
    }
}
