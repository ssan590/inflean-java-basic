package poly.car1;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setCar(k3Car);
        driver.drive();
    }
}
