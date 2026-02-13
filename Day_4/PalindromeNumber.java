public class PalindromeNumber{
    public static boolean isPalindorem(int x){
        if(x<0) return false;
        int rev=0;
        int copy=x;
        while(x!=0){
            rev=(rev*10)+(x%10);
            x/=10;
        }
        if(copy==rev)return true;
        else return false;
    }
    public static void main(String [] args){
        int x=121;
        System.out.println(isPalindorem(x));
    }
}