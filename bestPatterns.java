public class bestPatterns{

    public static void hollowRect(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }System.out.println("");
        }
    }
    public static void halfPyramid(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){                
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){                
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void numPyramid(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j);
                }System.out.println();
            }
        }


        public static void floydTriangle(int n){
            int k=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(k+" ");
                    k++;
                }System.out.println(" ");
                
            }

        }
        public static void zeroneTriangle(int n){
            int k=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                    System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }System.out.println(" ");
                
            }

        }
        public static void butterfly(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print('*');                  
                }
                // as value of j is reassigned for new block scope
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(' ');                  
                }
                for(int j=1;j<=i;j++){
                    System.out.print('*');                  
                }

                System.out.println(" ");
                
            }
// here for down butterfly pattern we start from n=i
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print('*');                  
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(' ');                  
                }
                for(int j=1;j<=i;j++){
                    System.out.print('*');                  
                }

                System.out.println(" ");
                
            }

        }
        // Solid Rhombus
        public static void solidRhombus(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // Hollow Rhombus same as hollow Rectangle
        public static void hollowRhombus(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // 
                
                for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
            }
        }
        // Diamond pattern
        public static void diamond(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // reversing upper part
            for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


        }
        
    
    public static void main(String args[]){        
        hollowRect(10,7);
        halfPyramid(5);
        // inverted and rotated
        numPyramid(5);
        floydTriangle(4);
        zeroneTriangle(5);
        butterfly(5);
        solidRhombus(5);
        hollowRhombus(5);
        diamond(3);
        
    }

}