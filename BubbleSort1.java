//time complexity=O(n^2)
//space complexity=O(1)

import java.util.Arrays;

public class BubbleSort1 {

    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean swap=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
        
        int[] arr={3,5,1,6,0};
        //method calling
        bubbleSort(arr);
        System.out.println("Sorted Array is:");
        System.out.println(Arrays.toString(arr));
    }
}
