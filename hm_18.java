public class hm_18 {
    public static void main(String[] args) {
    
        int[][][] matrix = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };

     
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    sum += matrix[i][j][k];
                    count++;
                }
            }
            double average = (double) sum / count;
            System.out.println("第 " + (i + 1) + " 層的平均值是: " + average);
        }
    }
}
