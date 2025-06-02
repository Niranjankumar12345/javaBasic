package javaBasic;

public class ReverseString {

    public static void main(String[] args) {

        String s="Madam";
        String a="";
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            a=c+a;
        }
        System.out.println(a);
        if(a.equalsIgnoreCase(s)){
            System.out.println("It's a Palindrome");
        }else {
            System.out.println("It's not a Palindrome");
        }
    }
}