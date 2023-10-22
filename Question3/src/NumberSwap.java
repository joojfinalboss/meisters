import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receive user input
        System.out.println("Enter the first number :)");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number :)");
        int secondNumber = scanner.nextInt();

        System.out.println("Before swapping numbers: "+ firstNumber +"---"+ secondNumber);

        // Swapping
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("After swapping: "+ firstNumber + "---" + secondNumber);
    }
}