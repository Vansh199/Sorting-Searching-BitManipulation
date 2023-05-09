//time complexity=O(logn)
//space complexity=O(1)
import java.util.Scanner;

public class Count {
    //implementation of binary search

    public static int count(int[] arr){
        int low=0;
        int high=arr.length-1;
           while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==0){
                low =mid+1;
            }
            else{
                high=mid-1;
            }
           }
           return (arr.length-low);
    }
    public static void main(String[] args) {
        
        //take input by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        //create an array
        int[] arr=new int[n];
        System.out.println("Enter "+n+" Elements:");
        //traverse in array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        //method calling
        int result=count(arr);
        System.out.println("Total number of one's in given array: "+result);
    }
}
