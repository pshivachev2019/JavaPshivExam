public class Main {

    public static void main(String[] args) {

        int [][] matrix1 = { {1,10,5,8}, {-5,2,30,2}, {8,12,6,3}, {12,7,8,1} };

        System.out.println();
        System.out.println("Матрица 1:");
        System.out.println();
        for (int i=0; i<matrix1.length; i++) {
            for (int j=0; j<matrix1[i].length; j++) {
                System.out.print(" " + matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int [][] matrix2 = { {-6,15,0,3}, {-7,4,15,1}, {3,2,16,32}, {2,3,5,8} };

        System.out.println("Матрица 2:");
        System.out.println();
        for (int i=0; i<matrix2.length; i++) {
            for (int j=0; j<matrix2[i].length; j++) {
                System.out.print(" " + matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int [][] matrixsum = new int [matrix1.length][matrix1.length];

        for (int i=0; i<matrix1.length; i++) {
            for (int j=0; j<matrix1.length; j++) {
                matrixsum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Матрица Суми:");
        System.out.println();
        for (int i=0; i<matrixsum.length; i++) {
            for (int j=0; j<matrixsum[i].length; j++) {
                System.out.print(" " + matrixsum[i][j]);
            }
            System.out.println();
        }
    }
}
