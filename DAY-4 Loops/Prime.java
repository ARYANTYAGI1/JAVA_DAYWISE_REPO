import java.util.Scanner;

public class Prime {
   public static void main(String[] args) {
    System.out.print("Enter Number:");
    Scanner scanner=new Scanner(System.in);
    int num=scanner.nextInt();
    int itr=0;
    int c=0;
    for(int i=2;i<=num/2;i++){
        itr=itr+1;
        if(num%i==0){
            c=c+1;
            break;
        }

    }
    if(c==1){
        System.out.print("Not Prime");
    }
    else{
        System.out.print("Prime"+" Take iter:"+itr);
    }
    scanner.close(); } 
}
