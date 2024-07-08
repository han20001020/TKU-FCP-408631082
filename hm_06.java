
import java.util.Scanner; // 載入 Scanner 類別

public class hm_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 Scanner 類別的物件

        System.out.print("請輸入第一個整數：");
        int num1 = scn.nextInt(); // 接收使用者輸入的第一個整數

        System.out.print("請輸入第二個整數：");
        int num2 = scn.nextInt(); // 接收使用者輸入的第二個整數

        int sum = num1 + num2; // 計算兩數之和

        System.out.println("兩數之和為：" + sum); // 輸出結果

        scn.close(); // 將 scn 關閉
    }
}
