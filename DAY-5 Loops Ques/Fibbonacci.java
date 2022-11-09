public class Fibbonacci {
    public static void main(String[] args) {
        int n=7;
        int a=0,b=1,c=0;
        System.out.print(a);
        for(int i=0;i<=n;i++){
           
           a=b;
           b=c;
           c=a+b;
           System.err.print(c+" ");
        }
       
    }
}
