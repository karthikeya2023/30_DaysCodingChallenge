package Day_2;

public class BinarySearch {
    public static int binaySearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)return mid;
            else if(target<arr[mid])high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    public static int binaySearchFirstOccurance(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                result= mid;
                high=mid-1;
            }
            else if(target<arr[mid])high=mid-1;
            else low=mid+1;
        }
        return result;
    }
    public static int binaySearchLastOccurance(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                result= mid;
                low=mid+1;
            }
            else if(target<arr[mid])high=mid-1;
            else low=mid+1;
        }
        return result;
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int arr1[]={1,1,1,2,2,3,3,3,3,3,3,4,4,4,5,5,5};
        int target=5;
        System.out.println(BinarySearch.binaySearch(arr, target));
        System.out.println(BinarySearch.binaySearchLastOccurance(arr1,3));
    }
}
