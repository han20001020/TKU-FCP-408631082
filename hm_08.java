
import java.util.Scanner; // 載入 Scanner 類別

public class hm_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告 Scanner 類別的物件

        // 接收使用者輸入的姓名
        System.out.print("請輸入您的姓名：");
        String name = scn.nextLine(); 

        // 接收使用者輸入的年齡
        System.out.print("請輸入您的年齡：");
        int age = scn.nextInt(); 
        scn.nextLine(); // 讀取整數輸入後的換行符

        // 接收使用者輸入的城市
        System.out.print("請輸入您所在的城市：");
        String city = scn.nextLine(); 

        // 輸出使用者輸入的資訊
        System.out.println("您的姓名：" + name);
        System.out.println("您的年齡：" + age);
        System.out.println("您所在的城市：" + city);

        scn.close(); // 將 scn 關閉
    }
}
