package RevLectures.Day2Calculator;

import java.util.Scanner;

public class Calculator {
    /**
     * Calculator app
     * multiply and divide
     * @param args
     */
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input first number: ");
            String n1input = sc.nextLine();
            double num1 = Double.parseDouble(n1input);
            System.out.println("Input second number: ");
            String n2input = sc.nextLine();
            double num2 = Double.parseDouble(n2input);
            System.out.println("Input 'multiply' or 'divide': ");
            String action = sc.nextLine();
            if(action.equals("multiply")){
                double result = multiply(num1, num2);
                System.out.println(num1 + " times " + num2 + " is " + result);
            }else if(action.equals("divide")){
                double result = divide(num1, num2);
                System.out.println(num1 + " divided by " + num2 + " is " + result);
            }
        }
    }

    public static double multiply(double a, double b){
        return a*b;
    }
    public static double divide(double a, double b){
        return a/b;
    }
}
