import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int num=scanner.nextInt();
         if(num==1)
             System.out.println("one");
         else if(num==10)
             System.out.println("Ten");
         else if(num==100)
             System.out.println("Hundred");
         else if(num==1000)
             System.out.println("Thousand");
         else
             System.out.println("Not valid");
    }
}
