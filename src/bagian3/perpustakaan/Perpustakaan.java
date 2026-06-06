package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // --- No 1: Method buat mengembalikan buku ---
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    b.setDipinjam(false); // status diubah jadi tidak dipinjam
                    System.out.println(judul + " berhasil dikembalikan.");
                } else {
                    System.out.println(judul + " statusnya tidak sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // --- No 3: Method buat cari buku berdasarkan nama penulis ---
    public void cariPenulis(String namaPenulis) {
        System.out.println("Hasil pencarian untuk penulis: " + namaPenulis);
        boolean ketemu = false;
        
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(namaPenulis)) { // pakai equalsIgnoreCase biar aman dari huruf besar/kecil
                System.out.println("- " + b.info());
                ketemu = true;
            }
        }
        
        if (!ketemu) {
            System.out.println("Tidak ada buku karya " + namaPenulis);
        }
    }

    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}