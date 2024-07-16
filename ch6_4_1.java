
public class ch6_4_1 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] sales = {{32, 35, 26, 30}, {34, 30, 33, 31}};

        for (int[] row : sales) {  // 輸出銷售量並計算總銷售量
            for (int n : row) {
                System.out.printf("%3d", n);
                sum += n;
            }
            System.out.println();  // 列印換行
        }
        
        
        System.out.printf("總銷售量為 %d 部車", sum);
    }
}
