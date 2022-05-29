import java.util.Scanner;

public class ForLoopNaturalNum {
    public static void main(String[] args) {
        //natural no.5->1+2+3+4+5;
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
            sum=sum+i;

        }
        System.out.println(sum);
    }
}
