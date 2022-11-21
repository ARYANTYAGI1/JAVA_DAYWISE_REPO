// import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Aryan");
        System.out.println(sb);
        // 1. CharAt
        System.out.println(sb.charAt(0));
        //2. set Char
    //    sb.setCharAt(0, "J");
    //    System.out.println(sb);
    sb.insert(0, "T");
    System.out.println(sb);
    sb.delete(0, 3);
    System.out.println(sb);
    sb.append("T");
    System.out.println(sb);
     }}