import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter All four  Side in m: ");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double D = scanner.nextDouble();




        double perimeter = A + B + C + D;

        System.out.println(perimeter);
    }
}
