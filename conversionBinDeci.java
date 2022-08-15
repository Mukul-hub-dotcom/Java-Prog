public class conversionBinDeci {
    public static boolean prime(int n) {
        boolean prime=true;

        if(n==2){
            prime=true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            prime=false;
            break;
        }   
     }return prime;
    }

// print prime in range
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)==true){
                System.out.print(i+" ");
                
            }
            
        }System.out.println();
    }
    // convert binary to decimal
    public static void conversionB2d(int n){
        int myNum=n;
        int pow=0;
        int decNum=0;
        while(n>0){
            int lastDig=n%10;
            decNum=decNum+(lastDig*(int)Math.pow(2,pow));
            pow++;
            n=n/10;      
            
        }System.out.println("decimal of "+ myNum +" = "+decNum);
    }
// conversion of decimal to binary
    public static void conversionD2b(int n){
        int myNum=n;
        int pow=0;
        int binNum=0;
        
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
                  
            
        }System.out.println("binary of "+ myNum +" = "+binNum);
    }



    public static void main(String[] args) {
        
System.out.println(prime(29));
primeRange(100);
conversionB2d(111);
conversionD2b(3);
    }
}
