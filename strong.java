public class strong {

    // Function to calculate factorial of a number
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is strong
    public static boolean isStrong(int number) {
        int originalNumber = number;
        long sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 5000;

        System.out.println("Strong numbers between " + lowerBound + " and " + upperBound + ":");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For a new line at the end
    }
}