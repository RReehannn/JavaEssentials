import java.util.Scanner;

class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number ");
        int number = input.nextInt();

        String result = number % 2 == 0 ?  "Even" : "ODD";
        System.out.println("Your number is " + result);
    }
}
