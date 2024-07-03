public class Test_04 {
    public static void main(String[] args) {
        // 宣告並賦值本金、年利率和年數
        double principal = 1000.0;
        double rate = 0.05;
        double time = 2.0;

        // 使用公式計算簡單利息
        double interest = principal * rate * time;

        // 使用System.out.printf()方法格式化輸出結果，保留兩位小數
        System.out.printf("簡單利息: %.2f\n", interest);
    }
}
