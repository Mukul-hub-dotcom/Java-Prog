import java.util.Scanner;

public class switchProg {
    public static void main(String[] args) {
        char ch='a';
        switch(ch){
            case 'a':System.out.println("samosa");
            break;
            case 'b':System.out.println("Burger");
            break;
            case 'c':System.out.println("Momos");
            break;
            default:System.out.println("Dream");          

        }
// if we don't use break then it will implement all cases after right choice

        Scanner sc=new Scanner(System.in);
        
        int a=7;
        int b=4;
        System.out.println("Enter Operator");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;  
            case '%':System.out.println(a%b);
            break;          
            default:System.out.println("wrong operator");

        }
    }
}
