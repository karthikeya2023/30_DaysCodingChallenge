package Day_3;
public class SecondHighestNumber {
    public static int SecondHightNumber(int arr[]){
        int max=arr[0];
        int SecondMax=-1;
        for(int i:arr){
            if(i>max){
                SecondMax=max;
                max=i;
            }
            if(i>SecondMax && i<max){
                SecondMax=i;
            }

        }
        return SecondMax;
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(SecondHighestNumber.SecondHightNumber(arr));
    }
}
