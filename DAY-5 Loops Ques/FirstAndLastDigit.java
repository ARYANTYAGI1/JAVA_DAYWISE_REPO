public class FirstAndLastDigit {
    public static void main(String[] args) {
        int n=1224;
        int a=0,b=0;
             a=n%10;
        System.out.println("Last Digit:"+a);
        while(n!=0){
         b=n%10;
            n=n/10;
        }
        System.out.println("First Digit:"+b);
        //Sum of First and Last Digit
        int sum=0;
        sum=a+b;
        System.out.println("Sum is "+sum);

        //swap first and last digit
    
    }
}
