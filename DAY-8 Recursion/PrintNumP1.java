public class PrintNumP1 {
    public static void solution(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        solution(n-1);
        // System.out.println("Hello");
    }
    public static void main(String[] args) {
        int n=5;
        solution(n);
    }
}
