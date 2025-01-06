package ch04class;

public class SaramMain02 {
    public static void main(String[] args) {
        // static 변수 = 정적 변수 = 클래스 변수
        // 클래스 이름으로 접근이가능하므로, 클래스 변수라고 부릅니다.
        Saram02.nationality = "대한민국";//static을 인스턴스 변수에 추가했을 때 이렇게도 가능. static은 필요악이다.


        //soo가 Saram02의 인스턴스변수(멤버변수)를 참조하도록 함.
        //객체변수 = 참조(레퍼런스)변수
        //인스턴스: 객체 ex)soo, 인스턴스가 가지고 있는 변수: 인스턴스 변수 ex)nationality, name, age

        Saram02 soo = new Saram02();

        //stack메모리에 있는 객체를 매개체로 heap메모리에 있는 인스턴스 변수를 참조한다.
        soo.name = "김철수";

        //클래스 변수는 객체 이름으로도 접근이 가능합니다.
        System.out.println(soo.nationality);
        System.out.println(soo.name);
        System.out.println(soo.age);

        soo.nationality = "코리아";

        Saram02 hee = new Saram02();
        System.out.println(hee.nationality); // soo의 코리아가 hee로 해도 출력됨. 서로 같은 곳을 참조중임.
    }
    //heap 메모리에 참조하지 않는 것은 JVM이 운영체제에 반납함. -> 이것이 가비지 컬렉터??

}
