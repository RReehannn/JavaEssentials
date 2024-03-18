import java.util.Scanner;

class AreaTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Base of triangle:- ");
        double base = scanner.nextDouble();
        System.out.print("Height:- ");
        double hight = scanner.nextDouble();

        double result = (base * hight)/2 ;

        System.out.println(result);

    }
}
