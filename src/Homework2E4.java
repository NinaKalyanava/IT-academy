import java.util.Scanner;

public class Homework2E4 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int lastDigit = number % 10;

        System.out.println("The last digit of the number is " + lastDigit);

        scanner.close();
    }
}