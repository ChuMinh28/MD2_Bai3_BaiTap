package bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr1 = new int[5];
        int [] arr2 = new int[3];
        int [] arr3 = new int[arr1.length+arr2.length];
        System.out.println("Nhap gia tri cho mang 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhap gia tri cho mang 2");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] =  Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang 1 sau khi khoi tao la: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d\t",arr1[i]);
        }
        System.out.println();
        System.out.println("Mang 2 sau khi khoi tao la: ");
        for (int j = 0; j < arr2.length; j++) {
            System.out.printf("%d\t",arr2[j]);
        }
//        Gan phan tu arr1 vao arr3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        //Gan phan tu arr 2 vao arr3
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length+j] = arr2[j];
        }
        System.out.println();
        System.out.println("Mang sau khi gop la: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%d\t",arr3[i]);
        }
    }
}
