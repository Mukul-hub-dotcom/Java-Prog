public class pattern {
    public static void main(String[] args) {
        int n=4;
        String str;
        for(int j=1;j<=4;j++){
            System.out.println("****");
        }

        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);

        // reverse of a number
        int m=10899;
        while(m>0){
            int lastDigit=m%10;
            System.out.print(lastDigit);
            m=m/10;
        }
        System.out.println("");
        
        
        // make no. reverse
        int h=10899;
        int rev=0;
        while(h>0){
            int lastD=h%10;
            rev=rev*10+lastD;            
            h=h/10;
        }System.out.print(rev);
    }
}
