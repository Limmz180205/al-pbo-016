package Perpustakaan;

public class NonFiksi extends Buku {
    private String bidang;

    public NonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    @Override
    public void displayInfo() {
        String penulis = "";
        System.out.println("Buku Non-Fiksi: " + penulis + " oleh " + penulis + " (Bidang: " + bidang + " )");
    }
}