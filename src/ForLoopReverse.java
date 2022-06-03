import java.util.Scanner;

public class ForLoopReverse {
    public static void main(String[] args) {
        //5432->2345 Reverse number
        Scanner scanner=new Scanner(System.in);
        int rem,rev=0;
        int num=scanner.nextInt();
        for(int i=1;i<num;i++)
        {
            while(num!=0) {
                 rem = num % 10;
                 rev = rev * 10 + rem;
                 num = num / 10;
             }

        }
        System.out.print(rev);

    }
}
