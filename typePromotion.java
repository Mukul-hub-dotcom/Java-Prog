public class typePromotion {
// type promotion happens only automatically in java while executing expressions

    public static void main(String[] args) {
        char a='a';
        char b='b';
        // char c=a-b;
        // lossy conversion from int to char msg displayed
        System.out.println(a);
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);
        char c='c';
        byte bt=(byte)(a+b+c);
        // here we do typecasting for lossyconversion ie int to byte change
        System.out.println(bt);
        

        int g=10;
        float h=20.5f;
        long i=25;
        double j=30;
        double ans=g+h+i+j;
        System.out.println(ans);

     byte k=5;
     k=(byte)(k*2);
     System.out.println(k);

    }

}
// typePromotion 2 rules=>
// if one operand is long,float or double then whole expression is converted to long float or double
// java automatically converted to each byte short or char operand to int to evaluate an expression







