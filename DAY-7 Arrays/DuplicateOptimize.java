import java.util.Scanner;

public class DuplicateOptimize {
    public static void main(String[] args) {
        System.out.print("Enter Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int ans=0;
        for(int i=0;i<size;i++){
            ans=arr[i]^ans;
        }
        for(int i=1;i<size;i++){
            ans=ans^i;
        }
        System.out.print(ans);
        scanner.close();
    }
}
