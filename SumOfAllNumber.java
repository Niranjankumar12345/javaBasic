package javaBasic;

import java.util.Scanner;

public class SumOfAllNumber {

    public static void main(String[] args) {
        Scanner nir=new Scanner(System.in);
        long value= nir.nextLong();
        System.out.println(sumOfDigitMethod(value));
    }

    public static Long sumOfDigitMethod(long a) {
        long e=0;
        long d=0;
        while(true){

            String b=Long.toString(a);
            String[] c=b.split("");
            for(int i=0;i<c.length;i++){
                 d=d+ Long.parseLong(c[i]);
            }
            a=d;
            d=0;
            if((a>0)&&(a<=9)){
                e=a;
                break;
            }
        }
        return e;
    }
}
