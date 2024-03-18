import java.util.Scanner;

class reverseTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Reverse The Digits");

        System.out.print("Please Enter the number: ");
        int number = scanner.nextInt();

        int reverse = reverse(number);
        System.out.println("Reverse number is " + reverse);


    }

    public static int reverse(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum;

    }
}
