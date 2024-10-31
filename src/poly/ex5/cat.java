package poly.ex5;

public class cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("나용");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
