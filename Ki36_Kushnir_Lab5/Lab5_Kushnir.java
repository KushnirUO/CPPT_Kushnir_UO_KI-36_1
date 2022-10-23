package Ki36_Kushnir_Lab5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab5_Kushnir {
    /**
     * The static main method is the entry point to the program
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter("Result_Calculator.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        double d = scanner.nextDouble();

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(d));
        printWriter.print(calculator.calculate(d));

        printWriter.flush();
        printWriter.close();
    }
}
