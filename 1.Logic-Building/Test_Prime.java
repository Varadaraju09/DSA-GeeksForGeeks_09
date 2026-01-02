public class Test_Prime {
    public static boolean PrimeTest(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(PrimeTest(n));
    }
}
