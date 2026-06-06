package bagian1.array;

public class LatihanMandiri {
    public static void main(String[] args) {
        
        // --- Nomor 1: Nyari suhu tertinggi dan terendah ---
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        
        double max = suhu[0];
        double min = suhu[0];
        
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        
        System.out.println("Suhu Tertinggi : " + max);
        System.out.println("Suhu Terendah  : " + min);
        System.out.println(); // buat pembatas baris kosong
        
        
        // --- Nomor 2: Cetak hari yang hurufnya lebih dari 5 ---
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Hari yang lebih dari 5 huruf:");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println("- " + h);
            }
        }
        System.out.println();
        
        
        // --- Nomor 3: Hitung total angka genap ---
        int[] angka = {4, 8, 15, 16, 23, 42};
        int totalGenap = 0;
        
        for (int a : angka) {
            // kalau habis dibagi 2 berarti genap
            if (a % 2 == 0) {
                totalGenap++;
            }
        }
        
        System.out.println("Banyak angka genap: " + totalGenap);
    }
}