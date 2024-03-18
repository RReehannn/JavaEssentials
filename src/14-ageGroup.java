import java.util.Scanner;

class ageGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age:- ");
        int age = scanner.nextInt();

        if (age >= 60){
            System.out.println("Senior");
        } else if (age >= 20) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teen" );
        } else {
            System.out.println("child");
        }
    }
}
