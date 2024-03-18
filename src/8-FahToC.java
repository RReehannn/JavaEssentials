import java.util.Scanner;

class FahToC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in F to C:--");

        System.out.print("Please Enter C tem:-");
        float F = scanner.nextFloat();

        float C = (F-32) * 5/9;

        System.out.println(C);
    }
}
