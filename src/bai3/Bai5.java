package bai3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size phan tu: ");
        int size = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[size];
        System.out.println("Khoi tao phan tu trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang sau khi khoi tao: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t",arr[i]);
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Gia tri nho nhat trong mang la: ");
        System.out.printf("%d",min);
    }
}
