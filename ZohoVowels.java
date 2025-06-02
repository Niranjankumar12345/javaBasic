package javaBasic;

import java.util.Scanner;

public class ZohoVowels {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("word");
        String a= scanner.next();

        String[] b=a.split("");
        String[] c={"a","e","i","o","u"};

        for(int i=0;i<b.length;i++){
            for(int j=0;j<c.length;j++){

                if(b[i].equalsIgnoreCase(c[i])){

                }else {
                    System.out.print(b[i]);
                }

            }
        }

    }
}
