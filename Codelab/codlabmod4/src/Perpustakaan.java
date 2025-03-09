package App;

import Perpustakaan.*;

class Main {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");


        buku1.displayInfo();
        buku2.displayInfo();

        System.out.println();


        Anggota anggota1 = new Anggota("Pascal Kaloka", "B055");
        Anggota anggota2 = new Anggota("Bazz", "B000");


        anggota1.displayInfo();
        anggota2.displayInfo();

        System.out.println();


        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        System.out.println();


        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}