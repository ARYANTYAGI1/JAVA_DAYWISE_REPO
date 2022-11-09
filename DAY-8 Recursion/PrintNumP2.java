public class PrintNumP2 {
    public static void solution(int i,int n){
        if(i==n+1){
            return ;
        }
        System.out.println(i);
        solution(i+1, n);
    }
    public static void main(String[] args) {
        int n=5;
        solution(1,n);
    }
}
