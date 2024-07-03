public class Test_01 {
    public static void main(String[] args) {
        // 宣告並賦值半徑
        double radius = 5.0;

        // 計算圓的面積
        double area = Math.PI * radius * radius;

        // 計算圓的周長
        double circumference = 2 * Math.PI * radius;

        // 使用System.out.printf()方法格式化輸出結果，保留兩位小數
        System.out.printf("圓的面積: %.2f\n", area);
        System.out.printf("圓的周長: %.2f\n", circumference);
    }
}
