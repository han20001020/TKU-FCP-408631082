
import java.util.Scanner; // 載入 Scanner 類別

public class hm_09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 Scanner 類別的物件

        // 接收使用者輸入的長方形的長
        System.out.print("請輸入長方形的長：");
        double length = scn.nextDouble();

        // 接收使用者輸入的長方形的寬
        System.out.print("請輸入長方形的寬：");
        double width = scn.nextDouble();

        // 計算長方形的面積
        double area = length * width;

        // 輸出長方形的面積
        System.out.println("長方形的面積為：" + area);

        scn.close(); // 將 scn 關閉
    }
}
