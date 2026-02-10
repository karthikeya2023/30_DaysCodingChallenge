public class MaximumSum{
    public static int findmaxSum(int [] arr){
        int maxSum=0;
        int currentSum=0;
        for(int i:arr){
            currentSum+=i;
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0)currentSum=0;
        }
        return maxSum;
    }
    public static int findmaxSumArrayContainsMixedNegativeNumbers(int nums[]){
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void main (String [] args){

        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaximumSum.findmaxSum(arr));
    }
}