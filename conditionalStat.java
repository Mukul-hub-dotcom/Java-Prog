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
    }
}
