public class ch5_3 {
    public static void main(String[] args) {
        int a = 8, b = 3, max;

        max = (a > b) ? a : b; // a > b 時，max = a，否則 max = b
        System.out.printf("a=%d, b=%d, %d 是較大的數\n", a, b, max);
    }
}
