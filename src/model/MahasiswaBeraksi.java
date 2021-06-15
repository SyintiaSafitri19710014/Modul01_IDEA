package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MahasiswaBeraksi {
    public MahasiswaBeraksi() {
    }

    public static void main(String[] args) throws ParseException{

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19710014";
        mahasiswa.nama = "Syintia Safitri";
        mahasiswa.tanggalLahir = simpleDateFormat.parse( "01-01-2002");

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("Npm \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa.tanggalLahir));
        System.out.println("Usia : \t\t\t : " + mahasiswa.hitungUsia() + " Tahun");
        System.out.println("");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19710083";
        mahasiswa2.nama = "Febri";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse( "05-03-2001");

        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("Npm \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));
        System.out.println("Usia : \t\t\t : " + mahasiswa2.hitungUsia() + " Tahun");
        System.out.println("");

        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.npm = "19710089";
        mahasiswa3.nama = "Riski Nurliana";
        mahasiswa3.tanggalLahir = simpleDateFormat.parse( "28-03-2001");

        System.out.println("Nama \t\t\t : " + mahasiswa3.nama);
        System.out.println("Npm \t\t\t : " + mahasiswa3.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa3.tanggalLahir));
        System.out.println("Usia : \t\t\t : " + mahasiswa3.hitungUsia() + " Tahun");
        System.out.println("");

        mahasiswa.menyapa();
    }
}