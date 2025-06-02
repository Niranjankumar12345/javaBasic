package javaBasic;

public class ReverseInt {

    public static void main(String[] args) {

        int sum=0;
        int a=123;
        while(a>0){
            int rem=a%10;
             sum=sum*10+rem;
             a=a/10;
        }

        System.out.println(sum);
    }
}
