package javaBasic;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner nir=new Scanner(System.in);
        System.out.println("enter the Number");
        int a= nir.nextInt();

        for(int j=1;j<a;j++) {
            int z=0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    z += i;
                }
            }
//        System.out.println(z);
            if (z ==j) {
                System.out.println(z+" It is a Perfect Number");
            }
        }
    }
}
