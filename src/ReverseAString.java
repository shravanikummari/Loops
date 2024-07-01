public class ReverseAString {

        public static String reverseString(String input) {
            String reversed = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }
            return reversed;
        }

        public static void main(String[] args) {
            String original = "hello"; // Example string
            System.out.println("The reversed string of \"" + original + "\" is: " + reverseString(original));
        }
    }

