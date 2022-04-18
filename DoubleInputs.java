import java.util.Scanner;

public class DoubleInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length:");
        double length = scanner.nextDouble();

        System.out.println("Enter breath:");
        double breath = scanner.nextDouble();

        double area = length * breath;

        int castedArea = (int) (area);
        System.out.println(castedArea);




    }
}
