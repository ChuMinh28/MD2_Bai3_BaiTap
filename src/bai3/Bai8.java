package bai3;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String arr = scanner.nextLine();
        System.out.println("Enter a key from your keyboard: ");
        char word = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i)==word){
                count++;
            }
        }
        System.out.printf("So lan xuat hien cua ky tu %s la: %d",word,count);
    }
}
