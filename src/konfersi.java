package com.Uas;
//sri andriyani//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class konfersi {
    public static void main(String[] args) throws IOException{

        InputStreamReader masuk = new InputStreamReader(System.in);
        BufferedReader msk = new BufferedReader(masuk);
        int sgr;
        double idr =10.567, hasil;

        System.out.printf("jumlah uang dolar = ");
        sgr = Integer.parseInt(msk.readLine());

        hasil =(sgr*idr);

        System.out.printf("======================");
        System.out.printf("konversi dolar singapura ke rupiah");
        System.out.printf("======================");

        System.out.printf("uang dolar (USD) = "+sgr +"dolar");
        System.out.printf("uang rupiah (IDR) = Rp. "+hasil);
    }
}
