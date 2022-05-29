import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        //1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int i=1,sum=0;
        while(i<=N) {
           sum=sum+i;
            i++;

        }
        System.out.println(sum);
    }

}
