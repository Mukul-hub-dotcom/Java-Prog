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
        float a=n+r;
        // possible lossy conversion from float to int thats why we do vice-versa
        System.out.println(a);
    }
    public static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static void printRange(int n){
        for(int i=2;i<n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void binDecimal(int bin){
        int pow=0;
        int dec=0;
        while(bin>0){
            int lastDig=bin%10;
            dec=dec+(lastDig*(int)Math.pow(2,pow));
pow++;
bin=bin/10;


        }
        System.out.println(dec);

    }
    public static void decBinary(int n){
        int pow=0;
        int bin=0;
        while(n>0){
            bin+=(n%2)*Math.pow(10,pow);
            n=n/2;
            pow++;
        }
        System.out.println(bin);

    }

    public static void main(String[] args) {
        // int n=9;
        // float r=2.0f;
        // // int r=2;
        // // binomial(n,r);
        // // add(n,r);
        // System.out.println(prime(n));
        // printRange(72);
        // binDecimal(10);
        decBinary(7);
        
    }
}
