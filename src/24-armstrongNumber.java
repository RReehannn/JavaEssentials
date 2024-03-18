import java.util.Scanner;

class armstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number: ");
        int num = scanner.nextInt();
        boolean isArm = isArmstrong(num);
        if (isArm){
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static boolean isArmstrong(int number){
        int noOfDigits = noOfDigits(number);
        int numCopy = number;
        int finalNumber = 0;
        while (number > 0){
            int lastDigit = number % 10;
            number /= 10;
            finalNumber += pow(lastDigit, noOfDigits );
        }

        return finalNumber == numCopy;

    }

    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while (i < num2){
            result *=num1;
            i++;
        }

        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }

        return digits;
    }
}
