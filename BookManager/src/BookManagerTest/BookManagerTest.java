package BookManagerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {
    private BookManager bookmanager;

    @BeforeEach
    void setUp() {
        bookmanager = new BookManager();
    }

    @Test
    void testAddBook() {
        Book book1 = new Book(1, "자바 기초", "Jane", 2021);
        bookmanager.addBook(book1);
        
        // 이미 있는 책을 추가하는 경우 태스트
        bookmanager.addBook(book1);
        
        // 리스트에 추가한 책 검색
        bookmanager.searchBook("자바 기초");
    }

    @Test
    void testSearchBook() {
        // 리스트에 책 추가
        Book book1 = new Book(1, "자바 기초", "Jane", 2021);
        Book book2 = new Book(2, "소프트웨어 공학", "Tom", 2014);
        Book book3 = new Book(3, "분산 컴퓨팅", "Yoon", 2024);
        bookmanager.addBook(book1);
        bookmanager.addBook(book2);
        bookmanager.addBook(book3);

        // 리스트에 추가된 책 검색
        bookmanager.searchBook("자바 기초");
        bookmanager.searchBook("소프트웨어 공학");
        bookmanager.searchBook("분산 컴퓨팅");

        // 리스트에 없는 책 검색
        bookmanager.searchBook("없는 책");
    }

    @Test
    void testRemoveBook() {
        Book book1 = new Book(1, "자바 기초", "Jane", 2021);
        Book book2 = new Book(2, "소프트웨어 공학", "Tom", 2014);
        bookmanager.addBook(book1);
        bookmanager.addBook(book2);
        
        // 리스트에 있는 책 삭제
        bookmanager.removeBook(1);
        // 리스트에 없는 책 삭제
        bookmanager.removeBook(1);
        
        // 리스트에서 제거한 후에 책 검색
        bookmanager.searchBook("자바 기초");
    }
}
