import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        System.out.print("Size:");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Elements:");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int count0=0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                count0++;

            }
            
        }
     for(int i=0;i<count0;i++){
        arr[i]=0;
     }
     for(int i=count0;i<size;i++){
        arr[i]=1;
     }
     System.out.print("Ans:");
     for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
     }
     scanner.close();
    }
}
