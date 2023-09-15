package TugasNo4;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; // Awalnya jumlah pinjaman adalah 0
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double jumlah) {
        if (jumlah <= limitPinjaman - jumlahPinjaman) {
            jumlahPinjaman += jumlah;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    //    public void angsur(double jumlah) {
//        if (jumlah <= jumlahPinjaman) {
//            jumlahPinjaman -= jumlah;
//        } else {
//            System.out.println("Maaf, jumlah angsuran melebihi jumlah pinjaman.");
//        }
//    }

//    Merubah method angsur agar Anggota mengangsur minimal dari pinjaman
    public void angsur(double jumlah) {
        double minimalAngsuran = 0.1 * jumlahPinjaman;
        if (jumlah >= minimalAngsuran) {
            jumlahPinjaman -= jumlah;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        }
    }
}

