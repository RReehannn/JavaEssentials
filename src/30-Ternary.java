import java.util.Scanner;

class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your score");
        int score = input.nextInt();

        String result = score > 80 ? "High" : (score > 50? "Moderate" : "Low");
        System.out.println(result);
    }
}
