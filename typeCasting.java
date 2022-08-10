import java.util.Scanner;

public class typeCasting {
    // type conversion happens only when destination is broader than source
    // byte<short<int<float<long<double
    // type conversion is also called widening || impicit conversion
    // lossy conversion happens against type conversion
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float number=sc.nextInt();
    System.out.println(number);
    }
    
}
