package ch04class;

import java.util.Scanner;

public class SaramMain03 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Saram03 soo =new Saram03(); //soo: 참조 변수로, new Saram02()로 생성된 객체의 메모리 주소를 저장합니다.
        Saram03 hee =new Saram03();

        soo.setName("김철수");
        hee.setName("김철수");

        soo.setAge(20);
//        soo.setName(sc.nextLine());
//        soo.setAge(sc.nextInt());

        System.out.println("이름 : " + soo.getName());
        System.out.println("나이 : " + soo.getAge());

    }
}
