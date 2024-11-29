package org.example;

package org.example;

public class PrimeNumberCounter {


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2, limit = (int) Math.sqrt(num); i <= limit; i++) {
            if (num % i == 0) {
                return false; // Delbart med i, så det är inte ett primtal
            }
        }
        return true;
    }

    /**
     * Räkna primtal mellan 0 och det angivna värdet.
     */
    public static int countPrimes(int max) {
        if (!isValidRange(max)) {
            return 0; // Ogiltigt intervall, ingen beräkning
        }

        int count = 0;
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Beräkna summan av primtalen mellan 0 och det angivna värdet.
     */
    public static int sumPrimes(int max) {
        if (!isValidRange(max)) {
            return 0; // Ogiltigt intervall, ingen beräkning
        }

        int sum = 0;
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Skriver ut antalet primtal mellan 0 och det angivna värdet.
     */
    public static void printCount(int max) {
        int count = countPrimes(max);
        System.out.println("Hej, det finns " + count + " primtal mellan 0 och " + max + "!");
    }

    /**
     * Skriver ut summan av primtalen mellan 0 och det angivna värdet.
     */
    public static void printSum(int max) {
        int sum = sumPrimes(max);
        System.out.println("Och den totala summan av dessa primtal är " + sum + ".");
    }

    /**
     * Validera om det angivna intervallet är inom det giltiga området.
     */
    public static boolean isValidRange(int max) {
        if (max < 0 || max > 1000) {
            System.out.println("Hoppsan, fel intervall angivet! Vänligen ange ett värde mellan 0 och 1000.");
            return false;
        }
        return true;
    }

    /**
     * Huvudmetod för att köra programmet.
     */
    public static void main(String[] args) {
        int max = 1000; // Här kan du sätta ett max-värde för att testa programmet.

        // Kolla om intervallet är giltigt
        if (isValidRange(max)) {
            printCount(max);
            printSum(max);
        }
    }
}
