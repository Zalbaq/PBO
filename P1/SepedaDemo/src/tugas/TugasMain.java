package tugas;

public class TugasMain {
    public static void main(String[] args) {
        // Turunan Handphone
        // Convensional Phone
        ConvensionalPhone convTlpn1 = new ConvensionalPhone();
        ConvensionalPhone convTlpn2 = new ConvensionalPhone();

        convTlpn1.setYearLaunching(1934);
        convTlpn1.setMerk("Nokia");
        convTlpn1.setRam(1);
        convTlpn1.setRom(2);
        convTlpn1.setCameraResolution(8);
        convTlpn1.addVolume(100);
        convTlpn1.reduVolume(30);
        convTlpn1.printInfo();
        System.out.println();

        convTlpn2.setYearLaunching(1950);
        convTlpn2.setMerk("Cross");
        convTlpn2.setRam(1);
        convTlpn2.setRom(4);
        convTlpn2.setCameraResolution(48);
        convTlpn2.addVolume(10);
        convTlpn2.reduVolume(30);
        convTlpn2.printInfo();
        System.out.println();

        // Handphpone
        Handphone hp = new Handphone();

        hp.setAndroidVersion("Lolipop");
        hp.setMerk("Xiaomi");
        hp.setRam(8);
        hp.setRom(128);
        hp.setCameraResolution(98);
        hp.addVolume(87);
        hp.reduVolume(59);
        hp.printInfo();
        System.out.println();

        // Motor
        Motor motor1 = new Motor("Honda", "CBR 250R");
        Motor motor2 = new Motor("Yamaha", "NMAX");

        System.out.println("Informasi Motor 1:");
        motor1.tampilkanInfo();

        System.out.println("\nInformasi Motor 2:");
        motor2.tampilkanInfo();

        motor1.hidupkanMesin();
        motor2.hidupkanMesin();
        System.out.println();

        motor1.percepat(30);
        motor2.percepat(20);

        System.out.println("\nInformasi Motor 1:");
        motor1.tampilkanInfo();

        System.out.println("\nInformasi Motor 2:");
        motor2.tampilkanInfo();

        motor1.matikanMesin();
        motor2.matikanMesin();

        System.out.println("\nInformasi Motor 1:");
        motor1.tampilkanInfo();

        System.out.println("\nInformasi Motor 2:");
        motor2.tampilkanInfo();
        System.out.println();

        // Router
        Router router1 = new Router("Router1", "192.168.1.1", 4);
        Router router2 = new Router("Router2", "192.168.2.1", 8);

        System.out.println("Informasi Router 1:");
        router1.hidupkanRouter();
        router1.tampilkanInfo();

        System.out.println("\nInformasi Router 2:");
        router1.matikanRouter();
        router2.tampilkanInfo();
    }
}
