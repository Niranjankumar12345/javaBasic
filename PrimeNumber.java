package javaBasic;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner nir=new Scanner(System.in);
        System.out.println("num :");
        int a=nir.nextInt();
        int count=0;

        for(int i=1;i<=a;i++){
            if(a%i==0)
                count++;
        }
        if(count==2)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}