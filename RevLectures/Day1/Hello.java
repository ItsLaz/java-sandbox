package RevLectures.Day1;

import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please input a number: ");
            int number = sc.nextInt();
            if(number > 0){
                System.out.println("You inputted a positive number");
            }else if(number < 0){
                System.out.println("You inputted a negative number");
            }else{
                System.out.println("You inputted 0");
            }
        }
    }
} 