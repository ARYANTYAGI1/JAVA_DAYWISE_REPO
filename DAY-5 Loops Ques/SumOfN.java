import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        System.out.print("Enter N:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("Sum: "+sum);
        scanner.close();
    }
}
