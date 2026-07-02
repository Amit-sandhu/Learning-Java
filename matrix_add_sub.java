import java.util.Scanner;

public class matrix_add_sub {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your matrix A : \n");
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] mat3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("Enter your matrix B : \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", mat3[i][j]);
            }
            System.out.printf("\n");
        }
        scanner.close();
    }
}
