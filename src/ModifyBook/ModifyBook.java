package ModifyBook;
/*
1. Book 클래스에 다음 필드를 추가하세요:
제목 (title): String
저자 (author): String
가격 (price): int

2. Getter와 Setter 추가하기:
Getter: getTitle(), getAuthor(), getPrice() 메서드를 추가하세요.
Setter: setTitle(), setAuthor(), setPrice() 메서드를 추가하세요.

3. main 메서드에서 다음 작업을 수행하세요:
Book 객체를 생성합니다. 생성자의 초기값은 비어 있어도 됩니다.
Setter 메서드를 사용하여 제목, 저자, 가격을 설정합니다.
Getter 메서드를 사용하여 제목, 저자, 가격을 출력합니다.
 */


public class ModifyBook {
    public static void main(String[] args) {

        //Book 생성 및 값 설정
        ModifyBook mybook = new ModifyBook(); //기본생성자 호출
        mybook.setTitle("정의란 무엇인가");
        mybook.setAuthor("마이클 샌델");
        mybook.setPrice(15000);

        //get메서드를 활용하여 값 출력.
        System.out.println("제목: "+mybook.getTitle());
        System.out.println("저자: "+mybook.getAuthor());
        System.out.println("가격: "+mybook.getPrice());
    }

    private String title;
    private String author;
    private int price;

    public ModifyBook(){ //기본 생성자
        this.title = ""; //기본값으로 초기화
        this.author = ""; //기본값으로 초기화
        this.price = 0; //기본값으로 초기화
    }

    public ModifyBook(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }


    //비공개(private)변수에 접근하기 위해 아래의 getter와 setter를 사용.

    //자바에서는 모든 메서드는 반환 타입을 반드시 명시해야 한다. 메서드가 값을 반환하지 않는다면, void를 사용하여 "이 메서드는 아무 값도 반환하지 않는다"는 것을 명시적으로 나타내야 한다.
    //비공개(private) 변수를 getter는 읽기, setter는 쓰기(변수의 값을 설정)를 한다.
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }


    public void setTitle(String title){ //받는 값은 ()안에 넣어주고 반환 타입은 없으니 void를 사용
        this.title = title; //전달받은 값으로 title 필드 설정.
    }
    public void setAuthor(String author){
        this.author = author; //전달받은 값으로 author 필드 설정.
    }
    public void setPrice(int price){
        this.price = price; //전달받은 값으로 price 필드 설정.
    }
}
