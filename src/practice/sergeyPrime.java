package practice;

import java.util.LinkedList;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class sergeyPrime {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                numbers.add(i);
            }


        }
        System.out.println(numbers);
    }
}

