import java.util.*;
public class arai{
    public static void reverse(int num[]) {
        int start=0;
        int end=num.length-1;

        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;


        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={4,2,3,5};
        reverse(num);
    }

}