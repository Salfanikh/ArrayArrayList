package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan3 {
    public static void main(String[] args) {
        // Bikin ArrayList kosong buat nampung data String
        ArrayList<String> mahasiswa = new ArrayList<>();

        // add() buat nambahin data ke dalam list
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        System.out.println("Isi list : " + mahasiswa);
        System.out.println("Jumlah   : " + mahasiswa.size());
        System.out.println("Index 1  : " + mahasiswa.get(1));
    }
}