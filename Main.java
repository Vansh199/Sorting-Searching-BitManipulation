import java.util.Scanner;


public class Main {

    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            count +=n&1;
            n>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=sc.nextInt();
        sc.close();
        int answer=countSetBits(number);
        System.out.println("The Number of Set Bits in the given number are: "+answer);
    }
}
