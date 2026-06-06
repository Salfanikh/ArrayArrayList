package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // array fix minimal 3 matkul
        String[] matkul = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        
        System.out.println("=== DATA MATA KULIAH ===");
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("- " + matkul[i]);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        // input awal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi Wijaya", "230101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso", "230102", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Lestari", "230103", 78.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi Kurniawan", "230104", 42.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Putri", "230105", 90.0));

        // cetak data awal
        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("=== info kelas ===");
        System.out.println("Rata-rata Nilai : " + kelas.hitungRataRata());
        System.out.println("Mahasiswa Lulus : " + kelas.jumlahLulus() + " orang");
        System.out.println();

        // nambah 1 mhs baru sesuai soal nomor 6
        System.out.println("-> nambah 1 mhs baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Ramadhan", "230106", 65.0));
        System.out.println();

        // print lagi data paling update
        System.out.println("=== DATA TERBARU ===");
        System.out.println("Total Mahasiswa Sekarang: " + kelas.totalMhs() + " orang");
        kelas.tampilkanSemua();
    }
}