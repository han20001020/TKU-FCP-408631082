
import java.util.Scanner; // 載入 Scanner 類別

public class hm_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 Scanner 類別的物件

        // 接收使用者輸入的三件商品的價格
        System.out.print("請輸入第一件商品的價格：");
        double price1 = scn.nextDouble();

        System.out.print("請輸入第二件商品的價格：");
        double price2 = scn.nextDouble();

        System.out.print("請輸入第三件商品的價格：");
        double price3 = scn.nextDouble();

        // 計算總價
        double totalPrice = price1 + price2 + price3;

        // 輸出總價
        System.out.println("三件商品的總價為：" + totalPrice);

        scn.close(); // 將 scn 關閉
    }
}
