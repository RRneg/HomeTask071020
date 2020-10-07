import java.util.Scanner;

public class LeonardusPisanus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number   ");
        int n = input.nextInt();

        MultiCalc i = new MultiCalc(n);

        System.out.println("Your next number  " + i.phi(n));
    }
}