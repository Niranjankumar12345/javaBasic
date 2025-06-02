package javaBasic;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner nir=new Scanner(System.in);
        System.out.println("no");
        long a=nir.nextInt();

        if(a%2==0)
            System.out.println("It's are Even Number");
        else System.out.println("It's are Odd Number");

    }
}
