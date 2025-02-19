package ex_07_If_condition;

import java.util.Scanner;

public class Lab086_Odd_Even {
    public static void main(String[] args) {
        // create program - take user Input
        // check whether number is even or Odd

        // step 1 : figure out input and output
        // number (int) ->i/o -> Scanner class can be used to take input
        // string -> odd or even  -> o/p , println
Scanner sc= new Scanner(System.in);
        System.out.println("enter a int number");
        int num= sc.nextInt();

        // step 2 rough logic
        // num%2==0 if number is divided by two then function is modulus -Remainder R=0 THEN Even number
            // num%2 ==!0  odd

        // logic writting
        if (num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
sc.close();
    }
}
