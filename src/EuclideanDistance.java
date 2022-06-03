import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        System.out.println("Euclidean distance :"+ distance);


    }
}
