package Student;

public class Main {
    public static void main(String[] args) {
        // 학생 객체 생성
        Student student = new Student("홍길동", 20, "S001");

        // 학생 정보 출력
        System.out.println("학생 정보:");
        student.printInfo();
    }
}
