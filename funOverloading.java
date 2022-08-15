public class funOverloading {
    // 1 function overloading happen because of function having same name and 
    // has diff. parameter
    //2. function overloading using datatype change
    public static void sum(int a,int b) {
        System.out.println(a+b);
        
    }
    public static int sum(int a,int b,int c) {
        return(a+b+c);
        
    }
    public static float sum(float a,float b) {
        return(a+b);
        
    }

    public static void main(String[] args) {
        sum(3,4);
        System.out.println(sum(3,4,5));
        System.out.println(sum(3.4f,7.5f));
    }
}
