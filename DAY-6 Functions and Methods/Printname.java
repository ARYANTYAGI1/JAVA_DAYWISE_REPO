import java.util.Scanner;

// package DAY-6 Functions and Methods;

public class Printname {
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String name=scanner.next();
       printMyName(name);
       scanner.close();
    }
}

