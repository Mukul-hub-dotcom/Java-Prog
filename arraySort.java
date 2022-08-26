import java.util.Collections;
import java.util.*;
// util.Arrays library used inbuilt sort
// * import all packages so better use *
public class arraySort {
    // arr has 0-based indexing thats why we use
      public static void bubble(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            // as everytime last element of biggers size hold its position at last
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    // swap happening of adjacent positions
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
        public static void printArr(Integer arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        public static void selection(int arr[]){
            // it has only swap of minimal element unlike bubble sort
            for(int i=0;i<arr.length-1;i++){
                // turn=i;
                int minPos=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[minPos]>arr[j]){
                        minPos=j;
                    }

                }
                int temp=arr[minPos];
                    arr[minPos]=arr[i];
                    arr[i]=temp;
            }
        }
        public static void insertion(int arr[]){
            // it gives the position of ele from unsorted to sorted arr
            for(int i=0;i<arr.length;i++){
                int curr=arr[i];
                int prev=i-1;
                // finding out corr pos to insert
                while(prev>=0 && arr[prev]>curr){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
                // inserrtion
                arr[prev+1]=curr;

               
            }
        }
        public static void countingSort(Integer arr[]){
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                largest=Math.max(largest,arr[i]);
            }
            int count[]=new int[largest+1];
            for(int i=0;i<arr.length;i++){
                count[arr[i]]++;
            }
            // sorting
            int j=0;
            for(int i=0;i<count.length;i++){
                while(count[i]>0){
                    arr[j]=i;
                    j++;
                    count[i]--;
                }
            }
        }


    
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
        // bubble(arr);
        // selection(arr);
       
        // insertion(arr);
        // above 3 has n^2 complexity
        
        Arrays.sort(arr, Collections.reverseOrder());
        // n log n
        // collection for descending and only work for Integer arr   not int arr
        countingSort(arr);
        // counting sort work for only pos. no.
        printArr(arr);
    }
}
