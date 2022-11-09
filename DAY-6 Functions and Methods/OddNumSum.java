import java.util.Scanner;

public class OddNumSum {
    public static int OddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
           
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter Nth term:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int ans=OddSum(n);
        System.out.print("Ans is:"+ans);
        scanner.close();
    }
}
