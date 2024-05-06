/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajar_p3_bab2;

import java.util.Scanner;

/**
 *
 * @author A-21
 */
public class Kalkulator {
    public static void main(String[] args) {
        // Deklarasi variabel
        int angka1, angka2;
        char operator;
        // Input data dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        angka1 = scanner.nextInt();
        
        System.out.println("Masukkan operator (+, -, *, /): ");
        String input = scanner.next();
        operator = input.charAt(0);
        
        System.out.println("Masukkan angka kedua: ");
        angka2 = scanner.nextInt();
        
        // Menghitung hasil
        int hasil;
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 == 0) {
                System.out.println("Pembagian dengan 0 tidak diizinkan!");
            return;
            }
            hasil = angka1 / angka2;
            break;
        default:
            System.out.println("Operator tidak valid!");
        return;
        }
        // Menampilkan hasil
        System.out.println("Hasil: " + hasil);
    }
}
