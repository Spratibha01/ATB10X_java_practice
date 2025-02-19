package ex_07_If_condition;

import java.util.Scanner;

public class Lab082_if_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your age");
        int age =sc.nextInt();

        if (age > 18){
            System.out.println("allowed to Vote");
        }
        else {
            System.out.println("Not Allowed");
        }



    }
}
