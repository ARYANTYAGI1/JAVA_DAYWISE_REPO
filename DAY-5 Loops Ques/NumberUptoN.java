import java.util.Scanner;

public class NumberUptoN {
    public static void main(String[] args) {
        System.out.print("Enter N:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        // 1. 1 to N
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        // N to 1 Reverse Order
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
        
        scanner.close();
    }
}
