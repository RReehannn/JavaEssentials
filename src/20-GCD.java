import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in GCD");

        System.out.print("Please Enter first number:- ");
        int first = scanner.nextInt();

        System.out.print("Please Enter second number:- ");
        int second = scanner.nextInt();

        int gcd= gcd(first, second);
        System.out.println("GCD of the number is " + gcd);



    }

    public static int gcd(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least){
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
                i++;
        }

        return gcd;

    }
    public static int least(int num1, int num2){
        if (num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }
}
