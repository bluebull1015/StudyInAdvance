package Student;

public class Student {
    // 속성 (필드)
    private String name;  // 학생 이름
    private int age;      // 학생 나이
    private String studentId; // 학생 학번

    // 생성자: 학생 객체를 만들 때 이름, 나이, 학번을 설정
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // 학생 정보를 출력하는 메서드
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("학번: " + studentId);
    }
}

