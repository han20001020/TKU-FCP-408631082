public class Test_03 {
    public static void main(String[] args) {
        // 宣告並賦值長方形的長和寬
        int length = 8;
        int width = 5;

        // 計算長方形的面積
        int area = length * width;

        // 計算長方形的周長
        int perimeter = 2 * (length + width);

        // 使用System.out.printf()方法格式化輸出結果
        System.out.printf("長方形的面積: %d\n", area);
        System.out.printf("長方形的周長: %d\n", perimeter);
    }
}
