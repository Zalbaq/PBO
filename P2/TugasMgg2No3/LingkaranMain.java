package TugasMgg2No3;
public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(14);
        Lingkaran lingkaran2 = new Lingkaran(7);

        System.out.println("Luas Lingkaran 1\t:" + lingkaran1.hitungLuas());
        System.out.println("Keliling Lingkaran 1:\t" + lingkaran1.hitungKeliling());
        System.out.println();
        System.out.println("Luas Lingkaran 2\t:" + lingkaran2.hitungLuas());
        System.out.println("Keliling Lingkaran 2:\t" + lingkaran2.hitungKeliling());

    }
}
