package motorencapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatud();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatud();

        motor.tambahKecepatan();
        motor.printStatud();

        motor.tambahKecepatan();
        motor.printStatud();

        motor.tambahKecepatan();
        motor.printStatud();

        motor.matikanMesin();
        motor.printStatud();
    }
}
