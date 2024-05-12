public class Recursion_Fun {
    public static void main(String[] args) {

        int result = fact(6);
        System.out.println(result);
    }

    // factorial
    public static int fact(int i) {

        if (i!=0) {
            return i * fact(i-1);
        }

        return 1;
    }
}
