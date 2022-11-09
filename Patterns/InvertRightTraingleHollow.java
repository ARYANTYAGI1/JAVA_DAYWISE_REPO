package Patterns;

public class InvertRightTraingleHollow {

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=5;j>=i;j--){
                if(i==1||j==5||i==j){

                
                System.out.print("*");
            }
            else{
                System.err.print(" ");
            }
        }
            System.out.println();
        }
    }
}


