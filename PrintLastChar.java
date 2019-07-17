import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int n=sc.nextInt();
      String s1=s.substring(s.length()-n);
      System.out.println(s1);
    }
}
