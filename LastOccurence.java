//time complexity=O(logn)
//space complexity=O(1)


public class LastOccurence {

    //implementation of binary search
    public static int lastOccurence(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                index=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        
        //create an array
        int[] arr={1,1,1,2,3,4,4,5,6,6,6,6};
        int target=4;
        //Method calling
        int result=lastOccurence(arr,target);
        if(result==-1){
            System.out.println("-1");
        }
        else{
            System.out.println("Last Occurence of Element is at Index: "+result);
        }
    }
}
