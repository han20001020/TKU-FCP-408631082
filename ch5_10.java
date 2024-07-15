public class ch5_10 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i % 3 == 0)  // 判斷 i % 3 是否為 0
                break;
            System.out.println("i=" + i);  // 印出 i 的值
        }
        System.out.println("when loop interrupted, i=" + i);
    }
}
