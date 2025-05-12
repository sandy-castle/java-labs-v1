package chapter7.labs.lab1;

import java.util.*;
/**
 * Object 클래스의 메소드를 오버라이딩하는 실습
 * 
 * 이 실습에서는 Java의 Object 클래스에서 제공하는 기본 메소드를 오버라이딩하여
 * 커스텀 클래스의 동작을 정의하는 방법을 학습합니다.
 * - equals(): 객체의 동등성 비교
 * - hashCode(): 객체의 해시 코드 생성
 * - toString(): 객체의 문자열 표현
 */
public class CustomObjectLab {
    public static void main(String[] args) {
        // TODO: Book 객체를 세 개 생성하세요.

        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + "번째 책 정보를 입력하세요.");
            System.out.print("ISBN: ");
            String isbn = sc.nextLine();
            System.out.print("제목: ");
            String title = sc.nextLine();
            System.out.print("저자: ");
            String author = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();
            // Book 객체 생성
            books[i] = new Book(isbn, title, author, price);
            System.out.println(); // 줄바꿈
        }
        System.out.println("입력한 책 목록:");
        for (Book book : books) {
            System.out.println(book);
        }
        // book1, book2는 동일한 ISBN을 가진 책
        // book3는 다른 ISBN을 가진 책

        System.out.println("참조비교");
        System.out.println("Book1 == Book2 : " +(books[0]==books[1]));
        System.out.println("Book2 == Book3 : " +(books[1]==books[2]));
        // TODO: equals() 메소드 테스트
        // book1과 book2, book1과 book3, book1과 null, book1과 다른 타입 객체를 비교하세요.
        System.out.println("\n=== 내용 비교 (equals) ===");
        System.out.println("books1.equals(books2) : "+books[0].equals(books[1]));
        System.out.println("books1.equals(books3) : "+books[0].equals(books[2]));
        System.out.println("books1.equals(null) : "+books[0].equals(null));
        
        // TODO: toString() 메소드 테스트
        // 각 Book 객체의 toString() 메소드 호출 결과를 출력하세요.
        System.out.println("\n=== toString 메소드 ===");
        System.out.println("books1.toString(): " + books[0].toString());
        System.out.println("books2 : " + books[1].toString()); // toString() 자동 호출
        System.out.println("books3 : " + books[2].toString());
        
        // TODO: hashCode() 메소드 테스트
        // 각 Book 객체의 해시코드를 출력하고, book1과 book2의 해시코드가 같은지 확인하세요.
        System.out.println("\n=== hashCode 비교 ===");
        System.out.println("books1.hashCode(): " + books[0].hashCode());
        System.out.println("books2.hashCode(): " + books[1].hashCode());
        System.out.println("books3.hashCode(): " + books[2].hashCode());
        System.out.println("books1 과 books2 의 hashCode() 값이 같은지 비교합니다 :" );
        if (books[0].hashCode() == books[1].hashCode())
        {System.out.println("book1과 book2의 해시코드는 같습니다.");}
        else
        {System.out.println("book1과 book2의 해시코드는 다릅니다.");}

        
        // TODO: HashMap Book 객체를 키로 사용하는 예제 코드를 작성하세요.
        // 1. HashMap<Book, String> 생성
        // 2. book1과 book3를 키로 하여 값 저장
        // 3. book1, book2, book3로 값 조회 시도
        HashMap<Book, String> bookMap = new HashMap<>();
        bookMap.put(books[0], "소장중");
        bookMap.put(books[2], "대여중");
        System.out.println("book1으로 조회: " + bookMap.get(books[0]));
        System.out.println("book2으로 조회: " + bookMap.get(books[1]));
        System.out.println("book3으로 조회: " + bookMap.get(books[2]));

        // TODO: ArrayList Book 객체의 존재 여부를 확인하는 예제 코드를 작성하세요.
        // 1. ArrayList<Book> 생성
        // 2. book1과 book3를 리스트에 추가
        // 3. book1, book2, book3가 리스트에 존재하는지 확인
        Book book1 = new Book("123-456", "자바의 정석", "남궁성", 32000);
        Book book2 = new Book("123-456", "자바의 정석", "남궁성", 32000); // book1과 ISBN 같음
        Book book3 = new Book("789-101", "Effective Java", "Joshua Bloch", 45000);

        // 1. ArrayList<Book> 생성
        ArrayList<Book> bookList = new ArrayList<>();

        // 2. book1과 book3를 리스트에 추가
        bookList.add(book1);
        bookList.add(book3);

        // 3. book1, book2, book3가 리스트에 존재하는지 확인
        System.out.println("book1 포함? " + bookList.contains(book1)); // true
        System.out.println("book2 포함? " + bookList.contains(book2)); // true (equals/hashCode 같다면)
        System.out.println("book3 포함? " + bookList.contains(book3)); // true

    }
}

/**
 * Object 클래스의 주요 메소드를 오버라이딩할 Book 클래스입니다.
 */
class Book
{
    // TODO: ISBN, 제목, 저자, 가격 필드를 선언하세요
    private String isbn;    // 국제 표준 도서번호
    private String title;   // 책 제목
    private String author;  // 저자
    private int price;      // 가격 (단위: 원)

    // TODO: 모든 필드를 초기화하는 생성자를 작성하세요.
    public Book(String isbn, String title, String author, int price)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // TODO: 필요한 Getter 메소드를 작성하세요
    public String getIsbn() {return isbn;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public int getPrice() {return price;}
    // TODO: equals() 메소드를 오버라이딩하여 ISBN이 같으면 동일한 책으로 판단하도록 구현하세요.
    // equals 메소드 구현 시 다음 사항을 고려하세요:
    // 1. 참조가 동일한지 확인 (this == obj)
    // 2. null 체크 및 타입 비교 (obj != null && getClass() == obj.getClass())
    // 3. 적절한 형변환 후 필드 비교
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return isbn.equals(other.isbn);
    }

    // TODO: hashCode() 메소드를 오버라이딩하여 equals와 일관되게 동작하도록 구현하세요.
    // ISBN이 같은 객체는 동일한 해시코드를 반환해야 합니다.
    // java.util.Objects.hash() 메소드를 활용하세요.
    @Override
    public int hashCode() {
        // ISBN이 같으면 같은 해시코드 → Objects.hash() 활용
        return java.util.Objects.hash(isbn);
    }
    // TODO: toString() 메소드를 오버라이딩하여 Book 객체의 모든 필드 정보를 포함한 문자열을 반환하세요.
    @Override
    public String toString()
    {
        // 모든 필드 정보를 문자열로 반환
        return "Book{" + "isbn='" + isbn + '\'' + ", title='" + title + '\'' +
                ", author='" + author + '\'' + ", price=" + price + '}';
    }
} 