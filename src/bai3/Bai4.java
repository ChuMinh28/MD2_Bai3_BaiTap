package bai3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][4];
        System.out.println("Nhap gia tri de khoi tao mang 2 chieu: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("arr[%d][%d] ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mang vua khoi tao la: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println();
        }
        int max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Gia tri lon nhat trong mang 2 chieu la: %d",max);
    }
}

