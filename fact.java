public class fact{
    public static int fact(int n){
        int f=1;        
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binom(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int bino=a/(b*c);
        return bino;
    }
    public static void main(String[] args) {
        int n=5;
        // binomial coeff
        int r=2;
       
        
        System.out.println(binom(n,r));
    }

}