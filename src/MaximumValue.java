public class MaximumValue {
        public static int findMaximumValue(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array is empty or null");
            }

            int maxValue = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > maxValue) {
                    maxValue = arr[i];
                }
            }

            return maxValue;
        }

        public static void main(String[] args) {
            int[] exampleArray = {31, 25, 15, 19, 87, 22};
            System.out.println(findMaximumValue(exampleArray));
        }
    }