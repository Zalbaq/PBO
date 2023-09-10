package TugasMgg2No3;
public class Lingkaran {
    public double phi, r;

    Lingkaran( double r){
        this.phi = 22/7;
        this.r = r;
    }
    public double hitungLuas() {
        return phi * (r * r);
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }
}
