package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> listMhs = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        listMhs.add(m);
    }

    public double hitungRataRata() {
        if (listMhs.size() == 0) {
            return 0;
        }
        
        double total = 0;
        for (Mahasiswa m : listMhs) {
            total += m.getNilai();
        }
        return total / listMhs.size();
    }

    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa m : listMhs) {
            if (m.lulus()) {
                hitung++;
            }
        }
        return hitung;
    }

    public void tampilkanSemua() {
        System.out.println("Daftar Mahasiswa di Kelas:");
        for (int i = 0; i < listMhs.size(); i++) {
            Mahasiswa m = listMhs.get(i);
            String status = m.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + ". " + m.getNpm() + " - " + m.getNama() + " [Nilai: " + m.getNilai() + " | " + status + "]");
        }
    }

    // buat dapet jumlah data terbaru
    public int totalMhs() {
        return listMhs.size();
    }
}