import java.util.Scanner;
public class DigitCountAdder {
    public static void main(String[] args) {
        // Algorithm that calculates the sum of the digits of the entered number.

        Scanner in = new Scanner(System.in);
        String m1,m2;
        int num,calculator = 0,counter = 0,modNumber;


        m1 = "Please enter the number you want to calculate the sum of its digits : ";
        m2 = "Result : ";

        System.out.print(m1);
        num = in.nextInt();
        int tempNumber = num;

        while (tempNumber != 0){
            tempNumber /= 10;
            counter++;
        }

        tempNumber = num;
        while (tempNumber != 0){
            modNumber = tempNumber % 10;
            calculator += modNumber;
            tempNumber /= 10;
        }

        System.out.print(m2 + calculator);

    }

}
