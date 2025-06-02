package javaBasic;

import java.util.Scanner;

public class PowerOf3 {
    public static void main(String[] args) {
        Scanner nir=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a=nir.nextInt();
        int s=a-1;
        if((a&a-1)==s){
            System.out.println("It is power of 3");
        }else{
            System.out.println("It is not a Power of 3");
        }

    }
}
