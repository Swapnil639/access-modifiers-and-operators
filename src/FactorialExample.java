import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        //4!=1*2*3*4
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }

}
