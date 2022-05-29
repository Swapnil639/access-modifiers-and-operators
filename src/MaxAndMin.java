import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Three Input :");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        System.out.println(a+b*c);
        System.out.println(c+a/b);
        System.out.println(a%b+c);
        System.out.println(a*b+c);

    }
}
