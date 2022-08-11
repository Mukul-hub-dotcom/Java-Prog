import java.util.Scanner;

public class typeCasting {
    // type conversion happens only when destination is broader than source
    // byte<short<int<float<long<double
    // type conversion of type promotion is also called widening || impicit conversion
    // lossy conversion happens against rule of type conversion which is not sensible at all we done it via typecasting
    // typeCasting is narrowing conversion || explicit(jbrdasti) conversion
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float number=sc.nextInt();
    System.out.println(number);

    float a=25.12f;
    int b=(int)a;
    System.out.println(b);

    char ch='a';
    int number1=ch;
    System.out.println(number1);
    }
    
}
