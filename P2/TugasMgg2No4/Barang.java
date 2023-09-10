package TugasMgg2No4;

public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    Barang(String kode, String namaBarang, int hargaDasar, float diskon){
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual(){
        return Math.round(this.hargaDasar - ((this.diskon/100) * this.hargaDasar));
    }
    public void tampilData(){
        System.out.println("Kode Barang\t:" + this.kode);
        System.out.println("Nama Barang\t:" + this.namaBarang);
        System.out.println("Harga Dasar\t:" + this.hargaDasar);
        System.out.println("Harga Jual\t:" + this.hitungHargaJual());
        System.out.println("===========================================");
    }
}
