public class FibonacciSequence {
        public static void printFibonacciSequence(int N) {
            int num1 = 0, num2 = 1;

            for (int i = 1; i <= N; i++) {

                System.out.print(num1 + " ");

                int nextNum = num1 + num2;

                num1 = num2;
                num2 = nextNum;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Example usage:
            int N = 10;
            printFibonacciSequence(N);
    }}
