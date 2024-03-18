import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in game:- ");
        System.out.print("please Enter the number:- ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("negative");

        } else {
            System.out.println("Zero");
        }
    }
}
