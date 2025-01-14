package week3.oop;

public class Matrix {
    public static void main(String[] args) {

    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimention(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return false;
        }
        return true;
    }
    public static boolean haveSameDimention(double[][] matrix1, double[][] matrix2){
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            return false;
        }
        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j]=matrix1[i][j]+matrix1[i][j];
            }
        }
        return result;
    }
    public static double[][] add(double[][] matrix1, double[][] matrix2){
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j]=matrix1[i][j]+matrix1[i][j];
            }
        }
        return result;
    }
    public static int[][] subtract(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j]=matrix1[i][j]-matrix1[i][j];
            }
        }
        return result;
    }
    public static double[][] subtract(double[][] matrix1, double[][] matrix2){
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j]=matrix1[i][j]-matrix1[i][j];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j]+=matrix1[i][k]*matrix2[k][i];
                }
            }
        }
        return result;
    }
    public static double[][] multiply(double[][] matrix1, double[][] matrix2){
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j]+=matrix1[i][k]*matrix2[k][i];
                }
            }
        }
        return result;
    }

}