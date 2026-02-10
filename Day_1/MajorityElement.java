import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int findMajorityElement(int [] arr){
       int n = arr.length;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
          

            if (countMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }
    public static void main(String [] args){
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(MajorityElement.findMajorityElement(arr));
    }    
}
