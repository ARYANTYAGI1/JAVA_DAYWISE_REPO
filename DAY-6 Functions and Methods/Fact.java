
import java.util.Scanner;

public class Fact {
    public static int Facto(int num){
        int ans=1;
        for(int i=1;i<=num;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int result=Facto(num);
        System.out.print("factorial is "+result);
        scanner.close();
    }
}
