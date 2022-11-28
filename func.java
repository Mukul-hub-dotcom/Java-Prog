import java.util.*;
public class func {
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
    public static int calcSum(int a, int b) {     
        // parameters while definition 
        int sum=a+b;
        return sum;
        // return is used when datatype of function is not void
    }
    public static void swap(int a, int b) {     
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

        // return is used when datatype of function is not void
    }
    public static int change(int a) {
        a=15;
        return a;
    }
    public static void prime(int a){
        for(int i=1;i<=a;i++){
            System.out.println("MUKUL");
        }
    }
    public static void main(String[] args) {
        printHelloWorld();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calcSum(a,b);        
        // args while calling
        // System.out.println(sum);
        // swap(a,b);
        // // System.out.println(swap(a,b));
        // System.out.println(change(a));
        prime(a);
        
    }
}
// function which are written inside class are called method & by convention 
//java has functn inside class so they are methods


// java always have call by value as it has copy of args in parameter

