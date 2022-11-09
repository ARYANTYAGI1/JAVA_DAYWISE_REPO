public class FactorialP1 {
    public static void solution(int n,int f){
        if(n==0){
            System.out.println(f);
            return;
        }
        f=f*n;
        solution(n-1, f);
    }
    public static void main(String[] args) {
        int n=0;
        int f=1;
        solution(n,f);
    }
}
