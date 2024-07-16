public class hm_11 {
    public static void main(String[] args) {
     
        int[] numbers = {10, 23, 45, 67, 89, 12, 34, 56, 78, 90};

      
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

       
        System.out.println("陣列中的最大值是: " + max);
    }
}
