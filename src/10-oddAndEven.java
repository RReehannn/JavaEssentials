import java.util.Scanner;

class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Odd and Even");

        System.out.print("Please enter your number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Even number hai");

        } else {
            System.out.println("Odd hai bhai");
        }

    }

}
