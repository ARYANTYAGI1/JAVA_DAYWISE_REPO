import java.util.Scanner;

public class ArmstrongP3 {
public static void main(String[] args) {
    System.out.println("Enter Number:2");
    Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    int temp=num;
    int x=num;
    String s=Integer.toString(temp);
    int order=s.length();
    int ans=0;
    while(x!=0){
        int a=x%10;
        ans=ans+(int)(Math.pow(a, order));
        x=x/10;
        
    }
    if(ans==num){
        System.out.print("Arms");
    }
    else{
        System.out.print("Not Arms");
    }
    scanner.close();
} 
}

