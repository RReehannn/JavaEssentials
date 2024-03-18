import java.util.Scanner;

class compound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("compound interest:-");
        double principle = scanner.nextDouble();

        System.out.print("Please Enter Rate:- ");
        double rate = scanner.nextDouble();

        System.out.print("time in year:- ");
        int time = scanner.nextInt();

        double result = principle*Math.pow((1+ rate/100), time);

        System.out.println(result);

    }
}
