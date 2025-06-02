package javaBasic;

public class PrimeNumberss {

    public static void main(String[] args) {
        int c=0;

        int count=0;
        for(int i=1 ;i<=100;i++){
            for(int j=1;j<i;j++){

                if(i%j==0){
                    count++;
                }
            }

            if(count==1){
                System.out.println(i);
                c++;
            }
            count=0;
        }
        System.out.println(c);

    }

}
