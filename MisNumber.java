package javaBasic;

public class MisNumber {
    public static void main(String[] args) {
        int[] a={3,4,5,6,7,9,10};
        for(int i=0;i<a.length-1;i++){

            int z=a[i+1]-a[i];
            if((a[i+1]-1)!=a[i]){
                System.out.println(a[i]+1);
            }
        }
    }
}
