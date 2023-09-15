package operasigettersetter;

public class KoprasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar");
        System.out.println("Anggota " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Soekarno Hata no 18");
        anggota1.setor(100000);
        System.out.println("Anggota " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(50000);
        System.out.println("Anggota " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
