public class MainController {
    public static void main(String[] args) {

    }

    private static void printSomeNumbers() {
        for (int i = 6; i < 23; i++) {
            System.out.println(i);
        }
    }

    private static void printSomeNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
    }

    public static int sumUp(int start, int end) {
        int sum = 0;
        int i;
        for (i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int powerOfTwo(int p) {
        if (p < 0) return -1;

        int result = 1;

        for (int i = 0; i < p; i++) {
            result = result * 2;
        }
        return result;
    }

    public static int sumUpPowerOfTwo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + powerOfTwo(i);
        }
        return sum;
    }

    public static void rectangleStars(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean rectangleStarsSave(int width, int height) {
        if (width && height > 0) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        return false;
    }
}


