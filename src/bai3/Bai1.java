package bai3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n = Integer.parseInt(scanner.nextLine());
        int [] old = new int[n];
        System.out.println("khoi tao phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            old[i] = Integer.parseInt(scanner.nextLine());
        }
                System.out.println("mang truoc khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", old[i]);
        }
        System.out.println();
        System.out.println("Nhap vao gia tri can xoa trong mang");
        int deleteValue = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < old.length; i++) {
            if (old[i]==deleteValue){
                count++;
            }
        }
        int[] arrNew = new int[old.length-count];
        int index=0 ;
        for (int i = 0; i < old.length; i++) {
            if (old[i]==deleteValue){
                continue;
            }else {
                arrNew[index] = old[i];
                index++;
            }
        }
        System.out.println("Mang sau khi xoa la: ");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.printf("%d\t", arrNew[i]);
        }
//        int[] arr = new int[n];
//        System.out.println("khoi tao phan tu trong mang:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(scanner.nextLine());
//        }
//        System.out.println("mang truoc khi xoa: ");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("%d\t", arr[i]);
//        }
//        System.out.println();
//        System.out.println("Nhap vao chi so phan tu can xoa: ");
//        int index = Integer.parseInt(scanner.nextLine());
//        int[] arrNew = new int[n - 1];
//        for (int i = 0; i < n; i++) {
//            if (i < index) {
//                arrNew[i] = arr[i];
//            } else if (i == index) {
//                continue;
//            } else {
//                arrNew[i - 1] = arr[i];
//            }
//        }
//        System.out.println("Mang sau khi xoa la: ");
//        for (int i = 0; i < n-1; i++) {
//            System.out.printf("%d\t", arrNew[i]);
//        }
    }
}