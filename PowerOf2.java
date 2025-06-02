package javaBasic;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {

        Scanner nir=new Scanner(System.in);
        System.out.println("num :");
        int z=nir.nextInt();

        if((z&z-1)==0)
            System.out.println("yes");
        else System.out.println("no");

    }
}
