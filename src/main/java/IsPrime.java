import java.util.Scanner;

public class IsPrime {
    public static void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " not prime");
            return;
        }

        if (number == 2) {
            System.out.println(number + " is prime");
            return;
        }
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " not prime");
                return;
            }
        }

        System.out.println(number + " is prime");
    }

    public static void main(String[] args) {
        /* Prime properties:
        Bigger than 1, Only divisible by itself, 2 the only even Prime

         */
        Scanner scanner = new Scanner(System.in);
        //int userNumber = scanner.nextInt();
        checkPrime(15);
        checkPrime(28);
        checkPrime(40);
        System.out.println();
        checkPrime(11);
        checkPrime(43);
    }
}
