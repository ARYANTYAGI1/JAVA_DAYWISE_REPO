import java.util.Scanner;

public class PrefectNumber{
public static void main(String[] args) {
    System.out.print("Enter Number:");
    Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    int ans=0,a=0;
    for(int i=1;i<=num/2;i++){
        int temp=i;
        if(num%temp==0){
            while(temp!=0){
                 a=temp%10;
                ans=ans+a;
                temp=temp/10;
            }
        }
    }
    System.out.print(ans);
    if(ans==num){
        System.out.print("Number is Prefect");
    }
    else{
        System.out.print("Number is Not Prefect");
    }
    scanner.close();
}
}