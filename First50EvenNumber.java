package javaBasic;

public class First50EvenNumber {

    public static void main(String[] args) {

        int count=0;
        int a=0;
        while (true){
            if(++a%2==0){
                count++;
                System.out.println(a);
            }
            if(count==50){
                return;
            }
        }
    }
}
