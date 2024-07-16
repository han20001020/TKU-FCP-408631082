public class hm_17 {
    public static void main(String[] args) {
    
        int[][][] matrix = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        System.out.println("原始三維陣列:");
        printMatrix(matrix);

     
        matrix[1][1][1] = 99;  // 將matrix[1][1][1]修改為99

       
        System.out.println("修改後的三維陣列:");
        printMatrix(matrix);
    }

 
    public static void printMatrix(int[][][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print("matrix[" + i + "][" + j + "][" + k + "] = " + matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
