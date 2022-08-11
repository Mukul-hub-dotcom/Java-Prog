import java.util.*;
public class conditionalStat {
    public static void main(String[] args) {
        // if,else ,else if, ternary operator,switch
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("adult");
        }
        else if(age > 13 && age<18){
            System.out.println("Learner on ground");
        }
        else{           
                System.out.println("minor");
            
        }


        int a=25;
        int b=13;
        if(a>b){
            System.out.println("A is largest of two");
        }
        else{
            System.out.println("B is largest of two");
        }

        int d=sc.nextInt();
        if(d%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
