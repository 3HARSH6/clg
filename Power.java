public class Power {
    public static double power(int b, int ex) {

        if (ex < 0) {
            return 1.0 / b * power(b, ex + 1);
        }
        if (ex == 0)
            return 1;

        return b * power(b, ex - 1);
    }

    public static void main(String[] args) {
        int b = 2;
        int ex = -4;
        double result = power(b, ex);

        // if (ex < 0) {
        // System.out.println(1 / result);
        // } else {
        // }
        System.out.println(result);
    }
}
