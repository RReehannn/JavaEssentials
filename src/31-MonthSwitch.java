import java.util.Scanner;

class MonthSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pleae enter the months number: ");
        int months = input.nextInt();
        String monthName = getMonthName(months);
        System.out.println("Your months name is "+ monthName);


    }
    public static String getMonthName(int monthsNum){
        return switch (monthsNum){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "june";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Oct";
            case 11 -> "November";
            case 12 -> "Dec";
            default -> "Invalid months";
        };
    }
}
