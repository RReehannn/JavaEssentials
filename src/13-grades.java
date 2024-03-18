import java.util.Scanner;

class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in grading scheme");

        System.out.print("Please Enter your Number:- ");
        float percentage = scanner.nextFloat();

        if (percentage >= 90){
            System.out.println("A");
        } else if (percentage >= 75) {
            System.out.println("B");

        } else if (percentage >= 60) {
            System.out.println("C");

        } else if (percentage >= 30) {
            System.out.println("D");

        } else {
            System.out.println("F");

        }
    }
}
