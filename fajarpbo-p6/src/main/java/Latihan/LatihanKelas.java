/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import LatihanKelas_Person.Person;

/**
 *
 * @author A-21
 */
public class LatihanKelas {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        
        buku1.judul = "Java 1";
        buku1.author.nama = "Hadi";
        buku2.judul = "Java 2";
        buku2.author.nama = "Rudi";
        
        System.out.println(buku1.judul);
        buku1.author.namaperson();
        System.out.println(buku2.judul);
        buku2.author.namaperson();
        System.out.println(buku2.tahunpenerbitan);
        System.out.println(buku2.harga.beli);
        System.out.println(buku1.penerbit.nama);
    }
}

class Buku {
    String judul;
    Person author = new Person();
    int tahunpenerbitan = 2024;
    Harga harga = new Harga();
    PerusahaanBuku penerbit = new PerusahaanBuku();
}

class Harga {
    double jual = 100000.00;
    double beli = 80000.00;
}
