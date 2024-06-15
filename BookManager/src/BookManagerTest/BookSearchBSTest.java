package BookManagerTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookSearchBSTest {

    private Book[] books;
    private BookSearchBS bookSearch;

    // 각 테스트 전에 Book 배열과 BookSearchBS 인스턴스를 초기화
    @BeforeEach
    public void setUp() {
        books = new Book[10000];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(i + 1, "Title" + (i + 1), "Author" + (i + 1), 2000 + (i % 20));
        }
        bookSearch = new BookSearchBS(books);
    }

    // 존재하는 책을 검색하는 테스트 (일반 탐색)
    @Test
    public void testSearchFound() {
        int targetId = 5000;
        Book book = bookSearch.search(targetId);
        if (book != null) {
            System.out.println("일반 탐색: 책을 찾았습니다. ID: " + targetId);
        } else {
            System.out.println("일반 탐색: 책을 찾지 못했습니다. ID: " + targetId);
        }
        assertNotNull(book);
        assertEquals(targetId, book.getId());
    }

    // 존재하지 않는 책을 검색하는 테스트 (일반 탐색)
    @Test
    public void testSearchNotFound() {
        int targetId = 10001;
        Book book = bookSearch.search(targetId);
        if (book != null) {
            System.out.println("일반 탐색: 책을 찾았습니다. ID: " + targetId);
        } else {
            System.out.println("일반 탐색: 책을 찾지 못했습니다. ID: " + targetId);
        }
        assertNull(book);
    }

    // 존재하는 책을 검색하는 테스트 (이진 탐색)
    @Test
    public void testSearchBsFound() {
        int targetId = 5000;
        Book book = bookSearch.search_bs(targetId);
        if (book != null) {
            System.out.println("이진 탐색: 책을 찾았습니다. ID: " + targetId);
        } else {
            System.out.println("이진 탐색: 책을 찾지 못했습니다. ID: " + targetId);
        }
        assertNotNull(book);
        assertEquals(targetId, book.getId());
    }

    // 존재하지 않는 책을 검색하는 테스트 (이진 탐색)
    @Test
    public void testSearchBsNotFound() {
        int targetId = 10001;
        Book book = bookSearch.search_bs(targetId);
        if (book != null) {
            System.out.println("이진 탐색: 책을 찾았습니다. ID: " + targetId);
        } else {
            System.out.println("이진 탐색: 책을 찾지 못했습니다. ID: " + targetId);
        }
        assertNull(book);
    }


}
