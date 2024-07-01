public class FactorialCalculation{

    public static int factorial(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("The factorial of " + number + " is: " + factorial(number));
    }

    public static class SumofDigits {
        public static int sumOfDigits(int n) {
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit;
                n/=10;
            }
            return sum;
        }
        public static void main(String[] args){
            int number=12345;
            System.out.println("the sum of the digits of"+"is:"+ sumOfDigits(number));
        }
    }
}