package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

//    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }
    
    // 위에 생성자를 자기 자신을 호출하여 아래와 같이 변경
    // this() 는 생성자 코드의 첫줄에만 작성할 수 있다.
    MemberConstruct(String nane, int age) {
        this(nane, age, 40);
        System.out.println("생성자 호출 name=" + nane + ", age=" + age + ", grade=");

    }

    MemberConstruct(String nane, int age, int grade) {
            System.out.println("생성자 호출 name=" + nane + ", age=" + age + ", grade=" + grade);
            this.name = nane;
            this.age = age;
            this.grade = grade;
        }
}
