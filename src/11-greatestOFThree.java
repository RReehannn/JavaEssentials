import java.util.Scanner;

class greatestOFThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter first number:-");
        int first = scanner.nextInt();

        System.out.print("Please Enter second number:-");
        int second = scanner.nextInt();

        System.out.print("Please Enter third number:-");
        int third = scanner.nextInt();

        if (first>= second && first>=third){
            System.out.println("First is greatest");
        } else if (second>= third) {
            System.out.println("Second is greatest");

        } else {
            System.out.println("Third is greatest");
        }


    }

}
