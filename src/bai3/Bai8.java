package bai3;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arr = {"a","b","f","g","h","j","r","d","a","g","d","g","s","a","e","g","n"};
        System.out.println("Enter a key from your keyboard: ");
        String word = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (word==arr[i]){
                count++;
            }
        }
        System.out.printf("So lan xuat hien cua ky tu %s la: %d",word,count);
    }
}
