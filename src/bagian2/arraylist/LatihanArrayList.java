package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanArrayList {
    public static void main(String[] args) {

        // no 1 - list belanjaan
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Telor");
        belanja.add("Susu"); // ini item ke-2, indeksnya 1
        belanja.add("Roti");
        belanja.add("Kopi");
        
        // hapus item kedua
        belanja.remove(1);
        
        System.out.println("Isi list setelah dihapus: " + belanja);
        System.out.println("Total item: " + belanja.size());
        System.out.println();


        // no 2 - cari angka paling gede
        ArrayList<Integer> listAngka = new ArrayList<>();
        listAngka.add(24);
        listAngka.add(67);
        listAngka.add(12);
        listAngka.add(89);
        listAngka.add(43);
        
        int maks = listAngka.get(0);
        for(int n : listAngka) {
            if(n > maks) {
                maks = n;
            }
        }
        System.out.println("Semua angka: " + listAngka);
        System.out.println("Nilai paling besar: " + maks);
        System.out.println();


        // no 3 - filter nama yang depannya A
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Ali");
        nama.add("Bagas");
        nama.add("Aulia");
        nama.add("Doni");
        nama.add("Arya");
        nama.add("Fajar");
        
        System.out.println("Nama yang berawalan huruf A:");
        for(String x : nama) {
            if(x.startsWith("A")) {
                System.out.println("- " + x);
            }
        }
    }
}