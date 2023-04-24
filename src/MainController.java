public class MainController {

    private static int end;
    private static int start;

    public static boolean printSomeNumbers(){
        for(int i = start; i <= end; i++){
            System.out.println(i);
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(printSomeNumbers());
    }

    public static int sumUp(int start, int end) {
        int a = 0;
        int i;
        for (i = start; i <= end; i++) {
            a += i;
        }
        return a;
    }
}




