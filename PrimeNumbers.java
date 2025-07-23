public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");
        for (int i = 2; i <= 100; i++) { // Start from 2 as 1 is not prime
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) { // 0 and 1 are not prime numbers
            return false;
        }
        // Check for divisibility from 2 up to the square root of num
        // Any factor greater than sqrt(num) would have a corresponding factor less than sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}