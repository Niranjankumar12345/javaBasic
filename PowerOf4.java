package javaBasic;

import java.util.Scanner;

public class PowerOf4 {
    public static void main(String[] args) {

        Scanner nir=new Scanner(System.in);
        System.out.println("num :");
        int a=nir.nextInt();

        if(((a&a-1)==0) && (a%4==0))
            System.out.println("yes");
        else
            System.out.println("no");


    }
}
