import java.util.Scanner;

class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication Table ");

        System.out.print("Please Enter the table you want to print:- ");
        int Table = scanner.nextInt();
        multiplication(Table);
    }
    public static void multiplication(int num){
        int i = 1;
        while (i <=10){
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }

    }
}


//public static void MultiplicationTable (int num){
//    int i = 1;
//    while (i <= 10) {
//        System.out.println(num + " X " + i + " = " + (num * i));
//        i++;
