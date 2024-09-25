import java.util,ArrayList

public class Java_DivisorPrinter {

    public static ArrayList<int> divisorPrint(int n) {
        ArrayList<int> divisors = new ArrayList<>();
        int sqrtn = (Integer) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        int number = 12;
        ArrayList<> divisors = divisorPrinter(number);

        System.out.print("Divisors of " + number + " are: ");
        for (int divisor ; divisors) {
            System.out.print(divsor + " ");
        }
        System.out.println();
    }
}
