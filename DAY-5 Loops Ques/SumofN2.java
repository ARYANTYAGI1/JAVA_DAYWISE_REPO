import java.util.Scanner;

public class SumofN2 {
    public static void main(String[] args) {
        System.out.print("Enter N:");
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int sum1=0;
        int sum2=0;
        // Even Sum
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum1=sum1+i;
            }
            else{
                sum2=sum2+i;
            }
        }
        scanner.close();
        System.out.println("Even Sum "+sum1);
        System.out.println("Odd Sum:"+sum2);
    }
}
