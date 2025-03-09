package App;

import Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new NonFiksi("Azab Kubur", "El yepping", "Ilmu Agama");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri Kembar", "El yepiing", "Dongeng");


        buku1.displayInfo();
        buku2.displayInfo();

        System.out.println();


        Anggota anggota1 = new Anggota("Abdul Halim", "B016");
        Anggota anggota2 = new Anggota("AL", "B000");


        anggota1.displayInfo();
        anggota2.displayInfo();

        System.out.println();


        anggota1.pinjamBuku("Azab Kubur");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kembar", 7);

        System.out.println();


        anggota1.kembalikanBuku("Azab kubur");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kembar");
    }
}