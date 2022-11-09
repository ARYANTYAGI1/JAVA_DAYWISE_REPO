import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter Value:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        scanner.close();
    }
}
