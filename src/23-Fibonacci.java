import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in fibonacci series");
        System.out.print("Enter the number upto which you want to print series: ");
        int num1 = scanner.nextInt();
        System.out.println("Here is the Fibonacci series");
        printFibonacci(num1);
    }

    public static void printFibonacci(int num){
        if (num < 0) return;
        System.out.print("0 ");
         if (num == 0) return;
          System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }


    }
}
