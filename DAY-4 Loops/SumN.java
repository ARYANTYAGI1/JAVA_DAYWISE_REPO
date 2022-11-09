import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        System.out.println("Enter No.");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("Sum is "+sum);
        scanner.close();
    }
}
