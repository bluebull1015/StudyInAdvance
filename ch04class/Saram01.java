package ch04class;

public class Saram01 {
    // 단계01 : 클래스를 정의한다.
    // 기존의 데이터 타입 몇개를 묶어서 개발자가 만드는 새로운 유형의 데이터 타입
    // 고객이 원하는 것을 잘 알아야 클래스 정의를 잘할 수 있다(업무파악을 잘 할 것).
    // 클래스 구성 요소 : 변수(필드) + 메소드 + 생성자

    // 멤버변수 정의
    String nationality; //이 변수는 Saram01클래스의 멤버변수이다.
    String name;
    int age;

    // 정수 1개를 입력 받아서 +5 연산을 수행해 주는 메소드 구현하기
    // 반환타입 메소드이름(매개변수리스트){...}
    // 메소드 정의
    int plus5(int x){
        return x+5;
    }

    // 주민번호 뒤 1자리가 들어오면, 해당 이름과 성별에 대한 정보를 반환해 줍니다.
    // 예시) 김철수 님은 남자입니다.
    // 반환타입 메소드이름(매개변수리스트){...}
    String showGenderInfo(int juminno){
        String gender;
        if (juminno == 1 || juminno == 3) {
            gender = "남자";
        }else{
            gender = "여자";
        }

        String result ;
        result = name+"님은 "+gender+"입니다.";
        return result;
    }

    // 신상 정보를 출력해주는 메소드를 구현합니다.
    // 반환타입 메소드이름(매개변수리스트){...}
    // 메소드가 리턴하지 않을 경우에 사용하는 키워드 : void
    void display(){
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }


}
