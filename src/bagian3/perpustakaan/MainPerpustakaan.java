package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        // Ditambah parameter tahun terbit sesuai No 2
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        
        // Tampilkan awal
        perpus.tampilkanKoleksi();
        System.out.println();

        // Tes fitur pinjam dulu
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();
        
        // Tes No 1: Mengembalikan Buku
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        // Tes No 3: Cari Penulis
        perpus.cariPenulis("Andrea Hirata");
    }
}