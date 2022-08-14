import java.util.*;
public class basicQ {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in)  ;
      int n=sc.nextInt();

       // for 2 we write separate and prime can b check by raversing upto sqrt (n)
      boolean prime=true;
if(n==2){
  System.out.println("Prime");
}
else{
  for(int i=2;i<=Math.sqrt(n);i++ ){
    if(n%i==0){
      prime=false;
    }
    
  }
  if(prime==true){
  System.out.println("Prime");
}
else{
  System.out.println("Not a Prime");
}

}

      for(int g=1;g<=4;g++){
        for(int h=1;h<=g;h++){
          System.out.print('*');
        }
        System.out.println("");
      }

      for(int r=1;r<=4;r++){
        for(int t=1;t<=4-r+1;t++){
          System.out.print('*');
        }
        System.out.println("");
      }
     
  }

 
}
