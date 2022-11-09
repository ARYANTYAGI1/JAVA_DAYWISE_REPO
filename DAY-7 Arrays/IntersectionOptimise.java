import java.util.Scanner;

public class IntersectionOptimise {
    
    public static void main(String[] args) {
      System.out.print("Size1:");
      Scanner scanner=new Scanner(System.in);
      int size=scanner.nextInt();
      int a[]=new int[size];
      System.out.println("Enter Elements in Array:");
      for(int i=0;i<size;i++){
        a[i]=scanner.nextInt();
      }
      System.out.print("Size2:");
      int m=scanner.nextInt();
      int b[]=new int[m];
      System.out.println("Enter Elements in 2nd Array:");
      for(int j=0;j<m;j++){
        b[j]=scanner.nextInt();
      }
      int c[]=new int[10];
      int k=0;
      int i=0;
      int j=0;
      while(i<size&&j<m){
        if(a[i]==b[j]){
            c[k]=b[j];
            k++;
            // b[j]=Integer.MIN_VALUE;

        }
        else if(a[i]<b[j]){
            i++;
        }
        else{
            j++;
        }
      }
      System.out.print("Intersection:");
      for(int l=0;l<k;l++){
        System.out.print(c[k]+" ");
      }
      scanner.close();
    }
}
