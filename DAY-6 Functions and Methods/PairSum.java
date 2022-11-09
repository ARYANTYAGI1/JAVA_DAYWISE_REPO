import java.util.Scanner;

public class PairSum {
    public static void myfunc(int a[],int m){
        System.out.println("Enter Sum:");
        Scanner scanner=new Scanner(System.in);
        int sum=scanner.nextInt();
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(a[i]+a[j]==sum){
                    System.out.println(a[i]+","+a[j]);
                }
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        System.out.print("Size:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        myfunc(arr, n);
        scanner.close();
    }
}
