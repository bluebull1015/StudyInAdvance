package Book;
/*
Book 클래스는 다음 필드를 가집니다:
제목 (title) : 문자열
저자 (author) : 문자열
가격 (price) : 정수
생성자를 통해 위 필드들을 초기화하세요.
제목과 저자를 출력하는 메서드 display()를 만드세요.
main 메서드에서 Book 객체를 생성하고, display() 메서드를 호출해 책의 제목과 저자를 출력하세요.
*/

public class Book {
    public static void main(String[] args) {
        Book myBook = new Book("정의란 무엇인가","마이크 샌델"); // 개수와 타입이 맞는 생성자가 없다면 오류 발생.
        myBook.display();
    }

    String title = "";
    String author = "";
    int price = 0;

    public Book(String title, String author, int price){
        this.title = title; //this는 현재 객체의 필드를 명시적으로 나타낼 수 있다. 인스턴스 변수인 title을 참조한다.
        this.author = author;
        this.price = price;
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //static은 사용하면 오류 발생, static 메서드에서는 인스턴스 변수에 직접 접근할 수 없습니다.
    //해결방법 : 1. 변수를 static으로 선언. 2. static 메서드 내에서 객체를 생성하여 사용. 3. display 메서드를 인스턴스 메서드로 유지하고 객체를 통해 호출.
    public void display(){
        System.out.println(title);
        System.out.println(author);
    }
}
