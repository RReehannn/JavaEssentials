import java.util.Scanner;

class sumOfTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sum Of The Digit");
        System.out.print("Please Enter number:-");
        int num = input.nextInt();
        int sum = SumOfTheDigit(num);
        System.out.println(sum);
    }

    public static int SumOfTheDigit(int num){
        int sum = 0;
        while (num>0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;


    }
}
