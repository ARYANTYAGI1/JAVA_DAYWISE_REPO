import java.util.Scanner;

public class PrefectNumber2 {
    public static void main(String[] args) {
        System.out.print("Enter Upper Bound:");
        Scanner scanner=new Scanner(System.in);
        int end=scanner.nextInt();
    
        for(int i=1;i<=end;i++){
            int ans=0;
            for(int j=1;j<=i/2;j++){
                int temp=j;
                while(temp!=0){
                    int a=temp%10;
                    ans=a+ans;
                    temp=temp/10;
                }
                if(ans==i){
                    System.err.print(i+",");
                }
            }
            
        }
        scanner.close();
    }
}
