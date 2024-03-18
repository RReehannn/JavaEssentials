import java.util.Scanner;

class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in LCM");

        System.out.println("Please Enter your number:-");
        int first = input.nextInt();

        System.out.println("Please Enter your number");
        int second = input.nextInt();

        int LCM= lcm(first, second);
        System.out.println(LCM);

    }

    public static int lcm(int first, int second){
        int i = 1;
        while (true){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
    }

}
