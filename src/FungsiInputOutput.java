package com.belajar;

import java.util.Scanner;

public class FungsiInputOutput {
    public static void main (String [] args) {
        int nilai;
        String nama;


        Scanner masuk = new Scanner(System.in);
        System.out.printf("Nama = ");
        nama = masuk.nextLine();

        System.out.printf("Nilai = ");
        nilai = masuk.nextInt();

        System.out.printf("Kartu Hasil Studi Mahasiswa Polbeng");
        System.out.printf("Nama = " +nama);
        System.out.printf("Nilai = " +nilai);
    }
}
