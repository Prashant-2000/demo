public class Factorial {
    public static void main(String[] args) {
        int number = 5; // example number
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is : " + factorial);
        System.out.println("You can create more code like that...");
    }

    /**
     * Calculates the factorial of a given number.
     * 
     * @param number the number to calculate the factorial for
     * @return the factorial of the given number
     */
    public static int calculateFactorial(int number) {
        if (number < 0) {
            throw new ArithmeticException("Factorial not defined for negative numbers");
        } else if (number == 0 || number == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}
