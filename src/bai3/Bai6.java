package bai3;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[4][4];
        System.out.println("Khoi tao gia tri cho mang 2 chieu: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%d][%d]=",i,j);
                arr [i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mang vua khoi tao: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Muon tinh tong o cot thu may? ");
        int col = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (col==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.printf("Tong cua cot %d la: %d",col,sum);
    }
}
