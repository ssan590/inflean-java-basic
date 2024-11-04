package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근 불가 compile error
        //instanceMethod(); // 인스턴스 메서드 접근 불가 compile error
        
        staticValue++; //정적 변수 접근 가능
        staticMethod(); //정적 메서드 접근 가능
    }

    // 아래와 같이 객체의 참조값을 직접 매개변수로 전달하면 정적 메서드내에서 인스턴스 변수나 메서드 호출 가능
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }
    
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
