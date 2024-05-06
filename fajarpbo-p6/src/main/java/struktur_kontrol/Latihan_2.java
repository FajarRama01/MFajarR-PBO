/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur_kontrol;

/**
 *
 * @author A-21
 */
import java.util.Scanner;
public class Latihan_2 {
    public static void main(String[] args) {
        int variabel1 = inputNilaiInteger("variabel1");
        int variabel2 = inputNilaiInteger("variabel2");
        int batasBawah = inputNilaiInteger("batasBawah");
        int batasAtas = inputNilaiInteger("batasAtas");
        if (variabel1 < variabel2) {
            System.out.println("Variabel1 = "+ variabel1 + "kurang dari batasBawah yang bernilai "+ batasBawah );
        }
        
        if ((variabel1 < batasBawah) && (variabel1 < batasAtas)) {
            System.out.println("Variabel1 = "+ variabel1 + "kurang dari Variabel2 yang bernilai "+ variabel2 + " dan kurang dari variabel3 juga yang bernilai: " + batasAtas);
        }
        if (variabel1 <= batasBawah || variabel1 >= batasAtas) {
            System.out.println("Variabel 1 nilainya tidak berada di antara variabel 2 dan variabel 3");
        }

    }
        static int inputNilaiInteger(String namaVariabel){
            Scanner inputScanner = new Scanner(System.in);
            int nilaiInput;
            System.out.println("Silakan input nilai untuk variabel "+ namaVariabel);
            nilaiInput = inputScanner.nextInt();
            return nilaiInput;
        }
    
}
