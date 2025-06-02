package javaBasic;


import java.util.Scanner;

public class FindIndex {

    public static void main(String[] args) {

        Scanner nit = new Scanner(System.in);
        System.out.println("Target :");
        int target = nit.nextInt();

        int[] a = {4, 5, 6, 7, 8};

        int[] num = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
//                for (int k = j + 1; k < a.length; k++) {

                    if (a[i] + a[j]  == target) {
                        num[0] = i;
                        num[1] = j;
//                        num[2] = k;
                    }
//                }
            }
        }
        for (int q : num) {
            System.out.print(q + " ");
        }
    }
}
