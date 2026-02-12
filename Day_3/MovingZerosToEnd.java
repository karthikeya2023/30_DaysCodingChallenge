package Day_3;

import java.util.Arrays;

public class MovingZerosToEnd {
    public static void moveZeroesToEnd(int nums[]){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for( int i=j;i<nums.length;i++)nums[i]=0;
        System.out.println(Arrays.toString(nums));
    }
    public static int[] moveZeroesToEnd1(int nums[]){
        int j=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return nums;
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }
        }
       
        return nums;
    }

    public static void main(String []args){
        int arr[]={0,1,0,3,12};
        System.out.println(Arrays.toString(MovingZerosToEnd.moveZeroesToEnd1(arr)));
    }
}
