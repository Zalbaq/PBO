package tugas;

public class Router {

    private String nama;
    private String ipAddress;
    private int jumlahPort;
    private boolean status;

    public Router(String nama, String ipAddress, int jumlahPort) {
        this.nama = nama;
        this.ipAddress = ipAddress;
        this.jumlahPort = jumlahPort;
        this.status = false;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Router: " + nama);
        System.out.println("IP Address: " + ipAddress);
        System.out.println("Jumlah Port: " + jumlahPort);
        if (status) {
            System.out.println("Status Router Hidup");
        } else {
            System.out.println("Status Router Mati");
        }
    }

    public void hidupkanRouter() {
        status = true;
    }

    public void matikanRouter() {
        status = false;
    }
}
