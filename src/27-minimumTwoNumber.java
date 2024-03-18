import java.util.Scanner;

class minimumTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in minimum number");

        System.out.print("Please enter first number: ");
        int first = input.nextInt();

        System.out.print("Please enter second number: ");
        int second = input.nextInt();

        int result = second < first ? second : first;
        System.out.println("This the minimum number " + result);

    }

}
