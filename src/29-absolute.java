import java.util.Scanner;

class absolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Absolute number");
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();

        int result = num > 0 ? num : -num;
        System.out.println(result);

    }
}
