package tugas;

public class Motor {
    private String merk;
    private String model;
    private int kecepatan;
    private boolean mesinMenyala;

    public Motor(String merk, String model) {
        this.merk = merk;
        this.model = model;
        this.kecepatan = 0;
        this.mesinMenyala = false;
    }

    public void tampilkanInfo() {
        System.out.println("Motor " + merk + " " + model);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        if (mesinMenyala) {
            System.out.println("Status Mesin: Menyala");
        } else {
            System.out.println("Status Mesin: Mati");
        }
    }

    public void hidupkanMesin() {
        mesinMenyala = true;
    }

    public void matikanMesin() {
        mesinMenyala = false;
        kecepatan = 0;
    }

    // Method untuk mempercepat Motor
    public void percepat(int tambahanKecepatan) {
        if (mesinMenyala) {
            kecepatan += tambahanKecepatan;
            System.out.println("Motor dipercepat menjadi " + kecepatan + " km/jam.");
        } else {
            System.out.println("Mesin motor mati, tidak dapat dipercepat.");
        }
    }
}
