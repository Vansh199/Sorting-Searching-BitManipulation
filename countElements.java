//time complexity=O(logn)
//space complexity=O(1)
import java.util.Scanner;



public class countElements {
    //implementation of binary search
    public static int firstOccurence(int[] arr,int target){
         int low=0;
         int high=arr.length-1;
         int result=-1;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
         }
         return result;
    }

    public static int lastOccurence(int[] arr,int target){
          
        int low=0;
        int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
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
        System.out.println("Enter Element of which you want to Know Number of occurence");
        int x=sc.nextInt();
         sc.close();
         //method calling
         int first=firstOccurence(arr,x);
         int last=lastOccurence(arr,x);
         if(first==last && first==-1){
            System.out.println("-1");
         }
         else{
            System.out.println("Target "+x+" Occurs "+(last-first+1)+" Times");
         }
    }
}
