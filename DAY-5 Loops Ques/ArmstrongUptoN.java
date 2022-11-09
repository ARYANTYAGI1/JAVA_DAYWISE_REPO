import java.util.Scanner;

public class ArmstrongUptoN{
    public static void main(String[] args) {
        System.out.print("Enter the Upper Limit:");
        Scanner scanner=new Scanner(System.in);
        int end=scanner.nextInt();
        for(int i=1;i<=end;i++){
            int temp=i;
            int ans=0;
            while(temp>0){
                int a=temp%10;
                ans=ans+a*a*a;
                temp=temp/10;
            }
            if(ans==i){
                System.out.print(i+",");
            }
        }
        scanner.close();
    }
}