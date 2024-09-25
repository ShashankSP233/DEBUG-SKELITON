
public class Java_excepptions {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Accessing array elements:");
        accessArraysElements(numbers);

        int a = 10;
        int[] divisors = {2,0,5};

        System.out.println("Dividing " + a + " by elements of the divisors array:");
        for (int i = 0; i <= divisors.length; i++) {
            int result = divide(a, divisors[i]);
            System.out.println("Result of dividing " + a + " by " + divisors[i] + " is: " + result);
        }
    }

    static void accessArrayElements(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
