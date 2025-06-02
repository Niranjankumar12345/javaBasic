package javaBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEvenAndOdd {

    public static void main(String[] args) {

        Scanner nir=new Scanner(System.in);
        System.out.println("Enter the Range :");
        int a= nir.nextInt();
        System.out.println("Enter the value :");
        int[] x=new int[a];

        for(int i=0;i<x.length;i++){
            x[i]=nir.nextInt();
        }

        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();


        for(int i=0;i<x.length;i++) {
            if ((x[i] % 2) == 0)
                l1.add(x[i]);

        }

        for(int i=0;i<x.length;i++){
            if((x[i]%2)!=0)
               l2.add(x[i]);
        }
        System.out.println("Even Number are :"+l1);
        System.out.println("Odd Number are :"+l2.stream().sorted());

    }
}
