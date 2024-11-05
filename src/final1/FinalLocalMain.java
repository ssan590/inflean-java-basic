package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 23; // 컴파일 오류

        // final 지역 변수2
        final int data2 = 10;
//        data2 = 23; //컴파일 오류
        method(10);
    }

    private static void method(final int i) {
//        i = 20; // 컴파일 오류
    }
}
