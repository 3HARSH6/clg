public class Factorial {

    static int fact(int n) {

        // if (n > 0) {
        //     return n * fact(n - 1);
        // }
        // if (n == 0) {
        //     return 1;
        // }
        // return 1;


        if (n < 2) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(2));
    }
}
