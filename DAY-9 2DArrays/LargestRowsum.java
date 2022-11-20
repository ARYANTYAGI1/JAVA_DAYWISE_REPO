import java.util.Scanner;;
public class LargestRowsum {
    public static void main(String[] args) {
        System.out.print("Enter Row:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.print("Enter Column:");
        int m=scanner.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter Elements in Array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int max=-123444;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                 sum=sum+arr[i][j];
                 if(sum>max){
                    max=sum;
                 }
                
            }
        }
        System.out.println("Max is"+max);
        scanner.close();
    }
}
