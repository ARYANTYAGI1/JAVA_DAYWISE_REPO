import java.util.Scanner;

public class ThreeNumAvg {
    public static int Average(int a,int b,int c){
        int ans=(a+b+c)/2;
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter the Numbers:");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int result=Average(a, b, c);
        System.out.print("Average is:"+result);
        scanner.close();
    }
}
