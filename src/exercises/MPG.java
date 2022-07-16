package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven: ");
        double milesDriven = input.nextDouble();

        System.out.println("Enter gallons of gas consumed: ");
       double gas = input.nextDouble();

       double avgMpg = milesDriven/gas;

        System.out.println("Your average miles-per-gallon is " + avgMpg);
    }



}
