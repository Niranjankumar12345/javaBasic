package javaBasic;

public class IgnoreHash {

    public static void main(String[] args) {
        String s = "";
        String a = "The#pen#is#on#the#Table";
        char c;

        System.out.println(a.replace("#", " "));
        System.out.println(a);

        for (int i = 0; i < a.length(); i++) {

            c = a.charAt(i);
            if (c == '#') {
                s = c + s + " ";
            } else {
                s = s + c;
            }
        }
        System.out.println(s);
    }
}