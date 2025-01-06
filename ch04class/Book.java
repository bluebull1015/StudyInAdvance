package ch04class;
/*
책
제목, 저자, 가격, 판매서점, 책 후기
변수5개(static 3개, instance2개)
getter 4개
setter 1개
 */
public class Book {
    private static String title = "정의란 무엇인가";
    private static String author = "마이클 샌델";
    private static int price = 15000;
    private String bookstore = "영풍문고";
    private String review;

    public static String getTitle() {
        return title;
    }

    public static String getAuthor() {
        return author;
    }

    public static int getPrice() {
        return price;
    }

    public String getBookstore() {
        return bookstore;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getReview() {
        return review;
    }
}
