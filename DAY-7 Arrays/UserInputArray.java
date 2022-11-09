import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        System.out.print("Enter Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print("Elements in Array:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}
