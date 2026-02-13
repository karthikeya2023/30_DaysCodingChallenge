public class ReverseInteger {
    public static int reverse(int x){
        long rev=0;
        while(x!=0){
            rev=(rev*10)+(x%10);
            x/=10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)return 0;
        return (int)rev;

    }
    public static int CountDigits(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String [] args){
        int x=-123;
        System.out.println(reverse(x));
    }
}
