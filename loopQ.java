import java.util.*;

public class loopQ {
    public static void main(String[] args) {
        int counter=0;
        do{
            System.out.println("Hello World");
            counter++;
        }
        while(counter<5);



        for (int n=1;n<5;n++){
            if(n==3){
                break;
            }
            System.out.println("Mukl");
        }

        Scanner sc=new Scanner(System.in);
        
        do{
            int h=sc.nextInt();
            if(h%10==0){
                break;
            }
            System.out.println(h);
            
        }
        while(true);

        for(int l=1;l<5;l++){
            if(l==3){
                continue;
            }
            System.out.println(l);
        }

        // Stopping not provided in below
        do{
            System.out.println("Enter Your Number : ");
            int a=sc.nextInt();
            if(a%10==0){
                continue;
            }
            System.out.println(a);
          }
          while(true);
    }
    
}
