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
        System.out.println(buku1.tahunpenerbitan);
        System.out.println(buku1.harga.getBeli());
        System.out.println(buku1.penerbit.nama);
        buku1.harga.setJual(120000);
        System.out.println("Harga jual buku 1 = " + buku1.harga.getJual());
        System.out.println("Harga jual buku 2 = " + buku2.harga.getJual());
        buku1.terjual();
      
    }
}

class Buku {
    String judul;
    Person author = new Person();
    int tahunpenerbitan = 2024;
    Harga harga = new Harga();
    PerusahaanBuku penerbit = new PerusahaanBuku();
    
    public void terjual(){
        System.out.println("Buku Terjual dengan Harga : " + harga.getBeli());
    }
}

class Harga {
    private double jual = 100000.00;
    private double beli = 80000.00;
    
    public double getBeli(){
        return beli;
    }
    
    public void setBeli(double beli) {
        this.beli = beli;
    }

    public double getJual() {
        return jual;
    }

    public void setJual(double jual) {
        this.jual = jual;
    }
    
    
}
