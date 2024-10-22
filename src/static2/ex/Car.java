package static2.ex;

public class Car {
    private static int carCount = 0;
    private String name;

    public Car(String name) {
        this.name = name;
        System.out.println("차랑 구입, 이름: " + name);
        carCount++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + carCount);
    }
}
