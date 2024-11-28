package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.PrimeNumberCounter;

public class PrimeNumberCounterTest {

    @Test
    public void testIsPrime() {
        assertTrue(PrimeNumberCounter.isPrime(2));
        assertTrue(PrimeNumberCounter.isPrime(3));
        assertFalse(PrimeNumberCounter.isPrime(4));
        assertFalse(PrimeNumberCounter.isPrime(1));
        assertFalse(PrimeNumberCounter.isPrime(-1));
    }

    @Test
    public void testCountPrimes() {
        assertEquals(0, PrimeNumberCounter.countPrimes(1));
        assertEquals(4, PrimeNumberCounter.countPrimes(10));
        assertEquals(0, PrimeNumberCounter.countPrimes(-1));
    }

    @Test
    public void testSumPrimes() {
        assertEquals(0, PrimeNumberCounter.sumPrimes(1));
        assertEquals(17, PrimeNumberCounter.sumPrimes(10));
        assertEquals(0, PrimeNumberCounter.sumPrimes(-1));
    }

    @Test
    public void testGetCountMessage() {
        assertEquals("Hej, det finns 0 primtal mellan 0 och -1!", PrimeNumberCounter.getCountMessage(-1));
        assertEquals("Hej, det finns 4 primtal mellan 0 och 10!", PrimeNumberCounter.getCountMessage(10));
    }

    @Test
    public void testGetSumMessage() {
        assertEquals("Och den totala summan av dessa primtal är 0.", PrimeNumberCounter.getSumMessage(-1));
        assertEquals("Och den totala summan av dessa primtal är 17.", PrimeNumberCounter.getSumMessage(10));
    }
}
