package tugas;
public class ConvensionalPhone extends Phone{
    private String type = "Conventional Telephone";
    private int yearsLaunching;
    
    public void setYearLaunching(int year) {
        yearsLaunching = year;
    }
    
    public void getType() {
        System.out.println("Type\t\t\t: " + type);
    }
    public void getYearsLaunching(){
        System.out.println("Type\t\t\t: " + yearsLaunching);
    }
    public void printInfo() {
        setYearLaunching(yearsLaunching);
        getType();
        getYearsLaunching();
        super.printInfo();
    }
}