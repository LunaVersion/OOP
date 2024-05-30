package hus.oop.matrix;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
        int size = (int) (Math.random() * 6) + 5;
        SquareMatrix matrix1 = new SquareMatrix(size);
        SquareMatrix matrix2 = new SquareMatrix(size);
        System.out.println("Matrix 1:");
        System.out.println(matrix1);
        System.out.println("Transpose of Matrix 1:");


        System.out.println(matrix1.principalDiagonal());
        System.out.println(matrix2.principalDiagonal());
        System.out.println(matrix1.secondaryDiagonal());
        System.out.println(matrix2.secondaryDiagonal());

        System.out.println("Principal diagonal of Matrix 1:");
        int[] principalDiagonal1 = matrix1.principalDiagonal();
        printArray(principalDiagonal1);

    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
