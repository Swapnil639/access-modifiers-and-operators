import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Three Input :");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        
        int w = a+b*c;
        int x = c+a/b;
        int y = a%b+c;
        int z = a*b+c;
        
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        if(w>x && w>y && w>z)
            System.out.println("W is Maximum :"+w);
        else if(x>w && x>y && x>z)
            System.out.println("X is Maximum :"+x);
        else if(y>w && y>x && y>z)
            System.out.println("Y is Maximum :"+y);
        else
            System.out.println("Z is Maximum :"+z);

        if(w<x && w<y && w<z)
            System.out.println("W is Minimum :"+w);
        else if(x<w && x<y && x<z)
            System.out.println("X is Minimum :"+x);
        else if(y<w && y<x && y<z)
            System.out.println("Y is Minimum :"+y);
        else
            System.out.println("Z is Minimum :"+z);


   }
}
