import java.util.*;

public class normalQ {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if(income<500000){
            tax=0;
        }
        else if(income>500000 && income<1000000){
            tax=(int)(income*0.2);
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("Your tax is : "+tax);

        int a=4;
        int b=3;
        int c=3;
        if(a>=b && a>=c){
            System.out.println("a is largest");
        }
        else if(b>=c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }



        int marks=5;
        String h=(marks>33)?"Pass":"fail";
        System.out.println(h);
    }
}
