import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            int number=scanner.nextInt();
            int rem,rev=0;
            while(number!=0)
            {
                rem=number%10;
                rev=rev*10+rem;
                number=number/10;
            }
        System.out.println(rev);

    }
}
