import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter principle Amount:- ");
        double principle = scanner.nextDouble();

        System.out.print("Please Enter Rate:- ");
        double rate = scanner.nextDouble();

        System.out.print("time in year:- ");
        int time = scanner.nextInt();

        double intrest = (principle*rate*time)/100 ;

        System.out.println(intrest);

    }

}
