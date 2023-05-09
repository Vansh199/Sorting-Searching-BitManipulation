//time complexity=O(n)
//space complexity=O(1)
import java.util.Scanner;


public class FindIndex{
    //implementation of linear search

    public static int search(int[] arr,int x){
        //store length of array in n variable
        int n=arr.length;
        //take an index variable
        int index=0;
        //traverse in array
        for(int i=0;i<n;i++){
            //check the condition 
            if(arr[i]==x){
                index=i;
                return index;
            }
        }
        return -1;
        
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
        System.out.println("Enter Element which you want to search");
        int x=sc.nextInt();
         sc.close();
        //method calling
        int result=search(arr,x);
        if(result==-1){
            System.out.println("Element not Found in Array");
        }
        else{
            System.out.println("Element found at Index: "+result);
        }
    }
}