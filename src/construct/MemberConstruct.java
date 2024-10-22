package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

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
