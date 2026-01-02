public class Power_of_Number {
    public static boolean isPower(int x, long y) {
        if (x == 1)
            return (y == 1);

        long pow = 1;
        while(pow < y) {
            pow *= x;
        }
        return (pow == y);
    }

    public static void main(String[] args) {
        int x = 10, y = 1001;
        System.out.println(isPower(x, y));
    }
}
