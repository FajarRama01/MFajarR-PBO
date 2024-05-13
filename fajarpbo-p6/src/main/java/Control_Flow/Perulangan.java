/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Flow;

/**
 *
 * @author A-21
 */
import java.util.Random;
import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Tuliskan pesan di sini, saya akan tampilkan berulang." );
        System.out.print( "Pesan: " );
        String message = keyboard.nextLine();

        //dua baris berikut untuk membuat bilangan random bertipe integer
        Random mesinRandom = new Random();
        int jumlahPengulangan = 1 + mesinRandom.nextInt(10);
        
        System.out.print( "Pesan akan diulang: "+ jumlahPengulangan + "kali\n" );
        
        for ( int n = 0 ; n < jumlahPengulangan ; n++ )
        {
            System.out.println( n + ". " + message );
        }
    }
}
