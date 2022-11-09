package Patterns;

public class ArrowPattern {
   public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=2*i;k++){
            System.out.print(" ");
        }       
        for(int j=5;j>=i;j--){
            System.out.print("*");
        }
        
        System.out.println();
    }
    for(int i=4;i>=1;i--){
        for(int k=1;k<=2*i;k++){
            System.out.print(" ");
        }       
        for(int j=5;j>=i;j--){
            System.out.print("*");
        }
        
        System.out.println();
    }
   } 
}
