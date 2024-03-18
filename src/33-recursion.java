import java.util.Scanner;

class recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial generation\n");
        System.out.print("Please enter number: ");
        int number = input.nextInt();
        long fact = factorial(number);
        System.out.println(fact);
    }
    public static long factorial(int num){
        if (num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }
}
