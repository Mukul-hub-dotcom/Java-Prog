import java.util.*;
public class inputTaking {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // way to take input       


        // String input=sc.next(); for taking single word input
        // System.out.println(input);

        String name=sc.nextLine();
        // for taking whole input like whole sentence
        System.out.println(name);

        int number=sc.nextInt();
        System.out.println(number);

        float price=sc.nextFloat();
        System.out.println(price);

        // next nextLine nextInt nextDouble nextBoolean nextShort nextLong
    }
}
