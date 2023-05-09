import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=sc.nextInt();
        sc.close();
        if((number&1)==1){
            System.out.println("Given Number is odd");
        }
        else{
            System.out.println("Given Number is Even");
        }
    }
}
