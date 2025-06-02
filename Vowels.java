package javaBasic;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        Scanner nir =new Scanner(System .in);
        System.out.println("value");
        String a=nir.nextLine();
       String ch;
       String volStr="";
       String contStr="";

       for(int i=0;i<a.length();i++){
           ch= String.valueOf(a.charAt(i));

           if(ch.matches("[aeiou]")){
               volStr=volStr+ch;
           }
           else
               contStr=contStr+ch;
       }
        System.out.println("Vowels :"+volStr);
        System.out.println("Consonants :"+contStr);
    }
}
