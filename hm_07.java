
import java.util.Scanner; // 載入 Scanner 類別

public class hm_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 Scanner 類別的物件

        System.out.print("請輸入圓的半徑：");
        double radius = scn.nextDouble(); // 接收使用者輸入的圓的半徑

        double area = Math.PI * radius * radius; // 計算圓的面積

        System.out.println("圓的面積為：" + area); // 輸出結果

        scn.close(); // 將 scn 關閉
    }
}
