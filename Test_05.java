public class Test_05 {
    public static void main(String[] args) {
        // 宣告並賦值體重和身高
        double weight = 70.0;
        double height = 1.75;

        // 使用公式計算BMI
        double bmi = weight / (height * height);

        // 使用System.out.printf()方法格式化輸出結果，保留一位小數
        System.out.printf("BMI: %.1f\n", bmi);
    }
}
