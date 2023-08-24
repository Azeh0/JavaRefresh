import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner KB = new Scanner(System.in);

        double NumA, NumB, Total = 0;
        String Operation;

        System.out.println("Welcome to the Calculator!");

        System.out.println("Enter in +, -, *, or /");
        Operation = KB.nextLine();

        System.out.println("Please Enter in Number 1");
        NumA = KB.nextDouble();

       System.out.println("Please Enter in Number 2");
        NumB = KB.nextDouble();

        switch (Operation) {
            case "+":
                Total = NumA + NumB;
                break;
            case "-":
                Total = NumA - NumB;
                break;
            case "*":
                Total = NumA * NumB;
                break;
            case "/":
                Total = NumA / NumB;
                break;
            default:
                System.out.println("Please Choose one of these four options!");
                break;
        }

       System.out.println("Your answer is " + Total);

    }
}
