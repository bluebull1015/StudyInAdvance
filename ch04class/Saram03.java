package ch04class;

public class Saram03 {
    //자바는 가급적 모든 정보를 비공개(private)로 하도록 권장한다. 그러기에
    private String name ;
    private int age;

    // 반환타입 메소드이름(매개변수){...}

    //age변수의 getter가 됨.
    // this객체라고  부른다.
    // this=soo this라는 객체에 soo가 참조됨.
    // this.인스턴스변수 = 지역변수
    // this는 레퍼런스변수(참조변수)이다.
    // _를 사용하든 this를 사용하든 큰차이는 없지만, this를 사용한다. _는 C++스타일이다.

    //getter와 setter의 단축키는 alt+insert이다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
