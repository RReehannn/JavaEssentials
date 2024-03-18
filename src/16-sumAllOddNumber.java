import java.util.Scanner;

class sumAllOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");

        System.out.print("please Enter your number: ");
        int num = scanner.nextInt();
        int sum = oddSum(num);
        System.out.println("oddsum till " + num + " is : " + sum);




    }
    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num){
            sum = sum +i;
            i += 2;
        }
        return sum;
    }
}





//Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Odd Sum");
//        System.out.print("please Enter your number: ");
//int num = input.nextInt();
//int sum = oddSum(num);
//        System.out.println("oddsum till " + num + " is : " + sum);
//    }
//
//public static int oddSum(int num){
//    int sum = 0;
//    int i = 1;
//    while (i <= num) {
//        sum = sum + i;
//        i += 2;
//
//    }
//    return sum;