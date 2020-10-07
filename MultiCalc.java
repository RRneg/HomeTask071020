public class MultiCalc<memnum> {
    public MultiCalc(int memnum) {
    }

    public static int phi(int memnum) {
        int[] fibonacci = new int[memnum + 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= memnum + 1; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        return fibonacci[memnum + 1];
    }

}
