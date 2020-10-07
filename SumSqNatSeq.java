import java.util.Scanner;

public class SumSqNatSeq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the long");
        int n = input.nextInt();


        Calculation sum = new Calculation(n);
        System.out.println("sum of squares of natural numbers of a sequence =  " + sum.calcSum(n));


    }
}
