public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int prev1 = 0;
        int prev2 = 1;

        System.out.println("Fibonacci Series:");
//        System.out.println(prev1 + " ");
//        System.out.println(prev2 + " ");

        for (int i = 2; i < n; i++) {
            int newfibo = prev1 + prev2;
            System.out.println(newfibo + " ");
            prev1 = prev2;
            prev2 = newfibo;
        }
    }
}