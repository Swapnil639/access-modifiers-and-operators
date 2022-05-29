import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        int month,day;
        Scanner scanner=new Scanner(System.in);
        month=scanner.nextInt();
        day=scanner.nextInt();
        boolean isSpring=(month==3 && day>=20 && day<=31)
                         || (month==4 && day>=1 && day<=30)
                         || (month==5 && day>=1 && day<=31)
                         || (month==6 && day>=1 && day<=20);
        System.out.println(isSpring);


    }
}
