package javaBasic;

import java.util.Scanner;

public class Powerof5 {

    public static void main(String[] args) {

        Scanner nir=new Scanner(System.in);
        System.out.println("num :");
        int s=nir.nextInt();
        int a=s-1;
        if(((s&s-1)==a) &&(s%5)==0)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
