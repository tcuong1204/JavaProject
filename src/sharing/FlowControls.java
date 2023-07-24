package sharing;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class FlowControls {

    public void IfElse() {
        Scanner scanner = new Scanner(System.in);  // This for user input
        int userInput = scanner.nextInt(); //  Input with int data type
        int maxScore = 10;
        if (userInput == maxScore) {
            System.out.println("Maximum score reached");
        } else if (0 <= userInput && userInput < maxScore) {
            System.out.println("Your number did not reach the maximum score");
        } else {
            System.out.println("Out of range");
        }
    }

    public String oneLineIfElse() {
        int tempThreshold = 25;
        System.out.println("Enter temperature");
        Scanner scanner = new Scanner(System.in);  // This for user input
        int userInput = scanner.nextInt(); //  Input with int data type

        return userInput >= tempThreshold ? "Hot" : "Cold";
    }

    public void WhileStatement() {
        System.out.println("ABC Program");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value");
        String userInput = scanner.next();

        while (!Objects.equals(userInput.toLowerCase(), "exit")) {
            System.out.println("Enter \"Exit\" to exit program");
            userInput = scanner.next();
        }

        System.out.println("Program exited");

    }

    public void DoWhileStatement() {
        System.out.println("ABC Program");
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Enter \"Exit\" to exit program");
            userInput = scanner.next();
        } while (!Objects.equals(userInput.toLowerCase(Locale.ROOT), "exit"));

        System.out.println("Program exited");

    }

    public void ForStatement() {
        int maxAge = 100;
        for (int i = 1; i <= maxAge; i ++) {
            System.out.println("Age: " + i);
        }

    }

    public void ForEachStatement() {
        String[] carBrand = {"Audi", "Honda", "Toyota", "MayBach", "BWM"};
        for (String element : carBrand) {
            System.out.println("Current car brand: " + element);
        }


    }

    public static void main(String[] args) {

        FlowControls flowControls = new FlowControls();
        flowControls.ForStatement();
        flowControls.ForEachStatement();
        flowControls.WhileStatement();
        flowControls.DoWhileStatement();
        flowControls.IfElse();
        System.out.println("Temperature: " + flowControls.oneLineIfElse());

    }

}
