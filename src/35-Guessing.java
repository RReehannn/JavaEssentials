import java.util.Scanner;

class Guessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 4, guess;
        System.out.println("Welcome to the guessing number");
        do{
            System.out.print("Guess number between 1 to 10 ");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("You have guessed");

    }

}
