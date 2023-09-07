public class Sepeda {
    private String merek;
    private int kecepatan;
    private int gear;

    public void setMerk(String newvalue){
        merek = newvalue;
    }
    public void gantiGear(int newvalue){
        gear = newvalue;
    }
    public void tambahKecepatan(int newvalue){
        kecepatan = newvalue;
    }
    public  void rem(int decrement){
        kecepatan = kecepatan - decrement;
    }
    public void cetakStatus() {
        System.out.println("Merk: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}
