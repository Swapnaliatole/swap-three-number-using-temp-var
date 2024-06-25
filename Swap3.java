
import java.util.Scanner;
public class Swap3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value a");
        int a=sc.nextInt();
         System.out.println("Enter a value b");
        int b=sc.nextInt();
        System.out.println("Enter a value c");
        int c=sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
         System.out.println("c:"+c);
        
        

        int temp=c;
        c=b;
        b=a;
        a=temp;

       
        System.out.println("After Swapping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
          System.out.println("c:"+c);
        


    }
}