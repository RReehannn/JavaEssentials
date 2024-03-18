import java.util.Scanner;

class Product {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("please Enter second number: ");
        double second = scanner.nextDouble();

        double result =  first*second;

        System.out.println(result);
    }
}
