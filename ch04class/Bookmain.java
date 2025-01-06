package ch04class;

public class Bookmain {
    public static void main(String[] args) {
        Book books = new Book();
        books.setReview("도덕적 딜레마에 대해 깊은 통찰을 제공하는 책");

        System.out.println("책 제목 : "+books.getTitle());
        System.out.println("<"+books.getTitle()+">"+"의 저자 : "+books.getAuthor());
        System.out.println("<"+books.getTitle()+">"+"의 가격 : "+books.getPrice());
        System.out.println("<"+books.getTitle()+">"+"를 판매하는 서점 : "+books.getBookstore());
        System.out.println("<"+books.getTitle()+">"+" 후기 : "+books.getReview());
    }
}
