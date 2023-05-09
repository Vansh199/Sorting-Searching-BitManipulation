//time complexity=O(logn)
//space complexity=O(1)
import java.util.Scanner;


public class SR {

    //implementation of binary search
    public static boolean checking(int num){
        int low=0;
        int high=num;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==num){
                return true;
            }
            else if(val<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //take input by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check whether the number is perfect square or Not");
        int num=sc.nextInt();
        sc.close();
        //method calling
        
        System.out.println("The given is a perfect square: "+checking(num));
    }
}
