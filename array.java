public class array {
    // array has ele of same datatype and indexing starts from zero
    public static void update(int marks[],int notChange){      
        notChange=89;
        // System.out.println(notChange);
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }   
    public static void main(String[] args) {
        // int marks[]=new int[50];
        
        // int numbers[]={1,2,3};

        // marks[0]=99;
        // marks[1]=99;
        // System.out.println("Physics marks = "+marks[0]);
        // System.out.print("Physics Rank = "+numbers[0]);

        int marks[]={91,79,98,99,100};
        
        int notChange=78;
        update(marks,notChange);
        // here we'll observe arr getting changed but int alone not updated as arr is call by reference and int notchange was call by value
       System.out.println(notChange);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
       
    }

}
