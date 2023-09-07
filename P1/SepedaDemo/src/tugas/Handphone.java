package tugas;

public class Handphone extends Phone {
    private String androidVersion, type = "Android";

    public void setAndroidVersion(String version) {
        androidVersion = version;
    }

    public void getType() {
        System.out.println("Type\t\t\t: " + type);
    }

    public void getAndroidVersion() {
        System.out.println("Version\t\t\t: " + androidVersion);
    }

    public void printInfo() {
        setAndroidVersion(androidVersion);
        getType();
        getAndroidVersion();
        super.printInfo();
    }

}
