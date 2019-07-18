import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String str[]=s.split("\\s");
       String one="";
       for(String w:str)
       {
            one+=w.substring(0,1).toUpperCase()+w.substring(1)+" ";
       }
       System.out.println(one+" ");
    }
}
