import java.util.Scanner;

class Arithmetical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in arithmetical OP");

        System.out.print("Please Enter first number:- ");
        int first = scanner.nextInt();

        System.out.print("Please enter second number:- ");
        int second = scanner.nextInt();

        int sum = first + second;
        int diff = first - second;
        int mul = first * second;
        int div = first/second;
        int mod = first%second;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
    }
}
