package javaBasic;

import java.util.Scanner;

public class SumOfDigitEqualTo {
    public static void main(String[] args) {

        Scanner nir = new Scanner(System.in);
        System.out.println("Enter the Lucky Number between 0to9");
        int luck = nir.nextInt();
        System.out.println("Enter the Range of Starting Value:");
        int start = nir.nextInt();
        System.out.println("Enter the Range of Ending Value:");
        int end = nir.nextInt();

        for (int i = start; i <= end; i++) {

            long s = SumOfAllNumber.sumOfDigitMethod(i);
            if (s == luck) {
                System.out.println(i);
            }
        }
    }
}
