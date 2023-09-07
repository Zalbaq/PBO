package tugas;

public class Phone {
    private String merk;
    private int ram, rom, cameraResolution, volume = 0;

    public void setMerk(String value) {
        merk = value;
    }

    public void setRam(int value) {
        ram = value;
    }

    public void setRom(int value) {
        rom = value;
    }

    public void setCameraResolution(int value) {
        cameraResolution = value;
    }

    public void addVolume(int value) {
        volume += value;
    }

    public void reduVolume(int value) {
        volume -= value;
    }

    public void printInfo() {
        System.out.println("Merk\t\t\t: " + merk);
        System.out.println("RAM Capacity\t\t: " + ram + " GB");
        System.out.println("ROM Capacity\t\t: " + rom + " GB");
        System.out.println("Camera Resolution\t: " + cameraResolution + " MP");
        System.out.println("Speaker Volume\t\t: " + volume + "%");
    }

}
