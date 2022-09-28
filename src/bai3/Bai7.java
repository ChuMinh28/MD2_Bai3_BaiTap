package bai3;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("Nhap gia tri de khoi tao mang: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d]=",i,j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mang vua khoi tao la: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d\t",arr[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("tong cac so o duong cheo chinh la: ");
        System.out.printf("%d",sum);
    }
}
