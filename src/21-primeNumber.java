import java.util.Scanner;

class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in prime number ");

        System.out.print("Please Enter your number:- ");
        int number = scanner.nextInt();

          boolean result = prime(number);
          if (result){
              System.out.println("Prime");

        } else {
              System.out.println("Not prime");
          }

    }

    public static boolean prime(int num){
        int i = 2;
        while ( i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }

        return true;

    }
}
