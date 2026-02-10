import java.util.Arrays;

public class ProductOfArrayExceptItSelf {
    public static int[] productofElements(int arr[]){
        int product=1;
        for(int i:arr)product*=i;
        for(int i=0;i<arr.length;i++){
            int divisor=product;
            arr[i]=divisor/arr[i];
        }
        return arr;
    }
    public static int[] productofElementsEfffectveSolution(int arr[]){
        int n = arr.length;
        int[] prefProduct = new int[n];
        int[] suffProduct = new int[n];
        int[] res = new int[n];

        // Construct the prefProduct array
        prefProduct[0] = 1;
        for (int i = 1; i < n; i++)
            prefProduct[i] = arr[i - 1] * prefProduct[i - 1];

        // Construct the suffProduct array
        suffProduct[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--)
            suffProduct[j] = arr[j + 1] * suffProduct[j + 1];
        
        for (int i = 0; i < n; i++)
            res[i] = prefProduct[i] * suffProduct[i];

        return res;
    }
    public static void main(String []args){
        int [] arr={10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(ProductOfArrayExceptItSelf.productofElements(arr)));
    }
}
