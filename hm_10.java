
public class hm_10 {
    public static void main(String[] args) {
       
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // 輸出總和
        System.out.println("總和 = " + sum);
    }
}
