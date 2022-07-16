package exercises;
import java.util.Scanner;

public class CalculateRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rectangle length:");
        Integer length = input.nextInt();

        System.out.println("Enter rectangle width:");
        Integer width = input.nextInt();

        int area = (length * width);
        System.out.println("The area of your rectangle is " + area);

    }
}
