import java.util.Scanner;

class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here I am calculating Leap year");

        System.out.println("Enter the year:- ");

        int year = scanner.nextInt();

        if (year % 4 == 0 || !(year % 100 == 0) || (year % 400==0)){
            System.out.print("This is leap year");
        } else {
            System.out.println("This is not leap year");
        }
    }
}

//(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
