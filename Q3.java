import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of numbers: ");
        int numberOfNumbers = sc.nextInt();

        int sum = 0;
        int number;

        do {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        float average = (float) sum / (numberOfNumbers - 1);
        System.out.println("The average is " + average);
    }
}
