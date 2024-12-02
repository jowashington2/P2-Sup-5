public class MagicSquare {
    public static boolean isMagicSquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int size = matrix.length;
        int magicSum = 0;

        // Sum of the first row
        for (int i = 0; i < size; i++) {
            magicSum += matrix[0][i];
        }

        // Check rows
        for (int i = 1; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) return false;
        }

        // Check columns
        for (int j = 0; j < size; j++) {
            int colSum = 0;
            for (int i = 0; i < size; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) return false;
        }

        // Check diagonals
        int diag1Sum = 0, diag2Sum = 0;
        for (int i = 0; i < size; i++) {
            diag1Sum += matrix[i][i];
            diag2Sum += matrix[i][size - i - 1];
        }

        return diag1Sum == magicSum && diag2Sum == magicSum;
    }
}
