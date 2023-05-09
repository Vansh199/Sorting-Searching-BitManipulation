import java.util.Scanner;


public class XOR {

    public static int findOddOccuring(int[] arr){
        int xor=0;
        for(int i:arr){
            xor = xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The odd occurring element is " + findOddOccuring(arr));
    }
}
