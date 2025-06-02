package javaBasic;

import java.util.Scanner;

public class AddTwoNumber {

    public static void main(String[] args){

        int x,y,sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("num1:");
        x=scanner.nextInt();
        System.out.println("Num2:");
        y=scanner.nextInt();
        sum=x+y;
        System.out.println("Sum is:"+sum);

    }
}