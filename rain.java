import java.util.*;
public class rain{
    public static int trappedRainWater(int height[]){
        // auxillary array made
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            // min height of side building -bar
            trappedWater+=waterLevel-height[i];
            

        }
        return trappedWater;

    }

    public static int bysell(int price[]){
        // auxillary profit array
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(buyPrice<price[i]){
                int profit=price[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=price[i];
            }
            
        }
return maxProfit;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
        int price[]={7,1,5,3,6,4};
        System.out.println(bysell(price));
    }
}
