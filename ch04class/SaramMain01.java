package ch04class;

public class SaramMain01 {
    public static void main(String[] args) {
        // 단계02 : 객체 생성
        // 클래스이름 객체이름 = new 생성자();
        // 생성자의 이름은 반드시 클래스 이름과 동일해야 합니다.

        //정의와 생성을 같이함.
        Saram01 soo = new Saram01(); // soo는 철수를 위한 객체.

        //정의와 생성을 따로함.
        Saram01 hee;
        hee= new Saram01(); // 객체를 생성한다.


        //단계03 : 멤버 변수에 값 대입(할당)_write
        //. 기호를 **멤버 참조 연산자**라고 합니다.
        soo.nationality = "대한민국";
        soo.name = "김철수";
        soo.age = 20;

        hee.nationality = "대한민국";
        hee.name = "박영희";
        hee.age = 30;


        //단계04 : 멤버 변수의 값 출력_read
        System.out.println("국적 : " + soo.nationality);
        System.out.println("이름 : " + soo.name);
        System.out.println("나이 : " + soo.age);

        System.out.println();

        System.out.println("국적 : " + hee.nationality);
        System.out.println("이름 : " + hee.name);
        System.out.println("나이 : " + hee.age);

        System.out.println();


        //메서드 사용 이유: 재사용성 때문.
        int result = soo.plus5(3); //메서드 호출
        System.out.println("결과01 : "+result);
        result = soo.plus5(100);
        System.out.println("결과02 : "+result);

        String message = soo.showGenderInfo(1);
        System.out.println(message);

        message = hee.showGenderInfo(2);
        System.out.println(message);

        soo.display();
    }
}
