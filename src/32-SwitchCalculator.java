import java.util.Scanner;

class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");

        System.out.print("Please Enter the first number:- ");
        int first = input.nextInt();

        System.out.print("Please Enter the Second number:- ");
        int second = input.nextInt();

        System.out.print("now, Enter the operation:- ");
        String operation = input.next();


        int result = switch (operation){
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            case "%" -> first % second;
            default -> -1;

        };
        System.out.println("Your answer is " + result);



    }

}
