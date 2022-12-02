public class funt {
    public static int factorial(int a){
        int fact=1;
        for(int i=a;i>=1;i--){
        fact*=i;
        }
        return fact;
    }
    public static void binomial(int n,int r){
        int a=factorial(n);
        int b=factorial(r);
        int c=factorial(n-r);
        int bino=a/(b*c);
        System.out.println(bino);
    }
    public static void add(int n,float r){
        int a=n+r;
        // possible lossy conversion from float to int
        System.out.println(a);
    }

    public static void main(String[] args) {
        int n=5;
        // float r=2.0f;
        int r=2;
        binomial(n,r);
        // add(n,r);
        prime(n);
        
    }
}
