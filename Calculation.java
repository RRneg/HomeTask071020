public class Calculation<seclen> {


    public Calculation(int seclen) {
    }


    public static int calcSum(int seclen) {
        int sum = (seclen + 1) * seclen * (2 * seclen + 1) / 6;
        return sum;
    }


}