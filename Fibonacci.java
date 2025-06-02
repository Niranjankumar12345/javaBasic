package javaBasic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner nir=new Scanner(System.in);
        System.out.println("num1");
        int a=nir.nextInt();
        System.out.println("num2");
        int b=nir.nextInt();

//        System.out.print(a+" ");
//        System.out.print(b+" ");

        for(int i=1;i<=10;i++) {
            int c=a+b;  //30=10+20
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
