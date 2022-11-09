import java.util.Scanner;

public class PrimeRange{
    public static void main(String[] args) {
        System.out.print("Enter N1:");
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        System.out.print("Enter N2:");
        int n2=scanner.nextInt();
        int sum=0;
        for(int i=n1;i<=n2;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c=c+1;
                }
            }
            if(c==2){
             sum=sum+i;
                System.out.print(i+" ");
            }

        }
        System.out.print("Sum is:"+sum);
        scanner.close();
    }
}