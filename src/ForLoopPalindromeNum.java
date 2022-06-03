import java.util.Scanner;

public class ForLoopPalindromeNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int temp=number;
        int rem,rev=0;
        for(int i=1;i<number;i++){
            while(temp!=0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
        }
        if (number==rev){
             System.out.println("Palindrome number");}
        else{
            System.out.println("not palindrome number" );}
    }

}
