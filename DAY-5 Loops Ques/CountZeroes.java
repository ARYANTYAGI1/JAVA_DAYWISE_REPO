import java.util.Scanner;

public class CountZeroes{
   public static void main(String[] args) {
      System.out.print("Enter Digit:");
      Scanner scanner=new Scanner(System.in);
      int n=scanner.nextInt();
      int c=0;
      while(n!=0){
         int rem=n%10;
         if(rem==0){
            c=c+1;
         }
         n=n/10;
      }
      scanner.close();
      System.out.print("No. of Zeroes:"+c);
      
   }

}