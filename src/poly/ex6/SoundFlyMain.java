package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chiken chiken = new Chiken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chiken);

        flyAnimal(bird);
        flyAnimal(chiken);

    }
    
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        animal.move();
        System.out.println("동물 소리 테스트 종료");
    }
    
    private static void flyAnimal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    } 
        
}
