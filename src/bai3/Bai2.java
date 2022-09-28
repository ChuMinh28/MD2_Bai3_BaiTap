package bai3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n = Integer.parseInt(scanner.nextLine());
        int[] old = new int[n];
        System.out.println("khoi tao phan tu trong mang:");
        for (int i = 0; i < old.length; i++) {
            old[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang truoc khi them: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", old[i]);
        }
        System.out.println();
        System.out.println("Nhap vao gia tri can them trong mang");
        int valueInsert = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao chi so can chen trong mang");
        int indexInsert = Integer.parseInt(scanner.nextLine());
        int[] arrNew = new int[old.length+1];
        for (int i = 0; i < arrNew.length; i++) {
            if (i<indexInsert){
                arrNew[i] = old[i];
            } else if (i==indexInsert) {
                arrNew[i] = valueInsert;
            }else {
                arrNew[i] = old[i-1];
            }
        }
        System.out.println("Mang sau khi them la: ");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.printf("%d\t", arrNew[i]);
        }

//        String product [] = new String[9];
//        product[0] = "Shirt";
//        product[1] = "Dress";
//        product[2] = "Shoes";
//        product[3] = "Hat";
//        System.out.println("Enter a product to add: ");
//        String add = scanner.nextLine();
//        System.out.println("Enter index of array: ");
//        int index = Integer.parseInt(scanner.nextLine());
//        if (index<=-1 || index>=product.length-1){
//            System.out.println("Please try again");
//        }else {
//            product[index] = add;
//        }
//        for (int i = 0; i < product.length; i++) {
//            System.out.println(product[i]);
//        }
    }
}
