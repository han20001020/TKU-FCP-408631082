
import java.util.Scanner; // 載入 Scanner 類別

public class hm_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 Scanner 類別的物件

        // 接收使用者輸入的華氏溫度
        System.out.print("請輸入華氏溫度：");
        double fahrenheit = scn.nextDouble();

        // 將華氏溫度轉換為攝氏溫度
        double celsius = (fahrenheit - 32) * 5 / 9;

        // 輸出攝氏溫度
        System.out.println("對應的攝氏溫度為：" + celsius);

        scn.close(); // 將 scn 關閉
    }
}
