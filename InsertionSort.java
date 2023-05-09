//time complexity=O(n^2)
//space complexity=O(1)

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        
        int[] arr={3,5,1,6,0};
        //method calling
        insertionSort(arr);
        System.out.println("Sorted Array is:");
        System.out.println(Arrays.toString(arr));
    }
}
