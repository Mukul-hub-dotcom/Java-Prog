public class dsa {
    // Linear Search
    public static int linearSearch(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return(i);
            }
            
        }return -1;

    }
    // Find largest and smallest
    public static void find(int marks[]){
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        // -infinity
        for(int i=0;i<marks.length;i++){
            if(marks[i]>large){
                large=marks[i];
            }
            if(marks[i]<small){
                small=marks[i];
            }
        }
        System.out.println("Largest Value = "+large);
        
        System.out.println("Largest Value = "+small);
    }

    // Binary search
    public static int binary(int number[],int key){
        
        int start=0, end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // comparisons
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]<key){                
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
    // reversing an array
    public static void reverse(int number[]){
        int first=0, last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }

    }
// pairing of number
    public static void pairing(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int curr=number[i];            
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
                tp++;
            }
            System.out.println();            
        }System.out.print("Total no. of pairs are = "+tp);
        // total pairs will be(n*(n-1))/2
    }

// subarray of no.
public static void subArray(int number[]){
    int ts=0;
    for(int i=0;i<number.length;i++){
        // i will be starting and j will be end point and k for traversing
        for(int j=i;j<number.length;j++){
            for (int k=i;k<=j;k++){
                System.out.print(number[k]+" ");               

            }System.out.println(" ");
            ts++;
        }System.out.println(" ");
    }System.out.println("total no. of subarray is = "+ts);
    // total no. of sub array is (n*(n+1))/2
}


    public static void main(String[] args) {
        // int marks[]={97,45,79,47,102};
        // int key=85;
        // System.out.println(linearSearch(marks,key));

        // find(marks);

        int number[]={2,4,6,8,10};       
        // System.out.println(binary(number,key));
        // // for binary Search arr must be in sorted order

        // reverse(number);
        // for(int i=0;i<number.length;i++){
        //     System.out.print(number[i]+" ");
        // }
        // System.out.println();

        // pairing(number);

        subArray(number);



    }
}
