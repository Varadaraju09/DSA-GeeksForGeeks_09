public class Valid_Triangle {
    public static boolean isTriangle(int x, int y, int z) {
        if(((x + y) > z) && ((y + z) > x) && ((x + z) > y)) {
            return true;
        }
        else 
            return false;
    }
    public static void main(String[] args) {
        int x = 1 , y = 10 , z = 12;
        System.out.println(isTriangle(x, y, z));
    }
}
