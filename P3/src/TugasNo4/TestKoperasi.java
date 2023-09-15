package TugasNo4;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
//        System.out.println("Nama Anggota: " + donny.getNama());
//        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
//
//        System.out.println("\nMeminjam uang 10.000.000...");
//        donny.pinjam(10000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//
//        System.out.println("\nMeminjam uang 4.000.000...");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//
//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//
//        System.out.println("\nMembayar angsuran 3.000.000");
//        donny.angsur(3000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());


//        Merubah Agar pengguna dapat menginputkan data lewat console
        Scanner input = new Scanner(System.in);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.print("\nMeminjam uang. Masukkan jumlah pinjaman: ");
        double jumlahPinjaman = input.nextDouble();
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMembayar angsuran. Masukkan jumlah angsuran: ");
        double jumlahAngsuran = input.nextDouble();
        donny.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        input.close();
    }
}

