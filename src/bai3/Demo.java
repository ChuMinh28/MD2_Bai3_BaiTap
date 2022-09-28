package bai3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //khoi tao va khai bao mang 2 chièu gom 3 cot va 4 dong
        int [][] arrInt = new int[3][4];
        //Nhap gia tri
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("arrInt[%d][%d]=",i,j);
                arrInt[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //In gia tri cac phan tu trong mang
        System.out.println("Gia tri cac phan tu trong mang 2 chieu la");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t",arrInt[i][j]);
            }
            System.out.println();
        }
    }
}
