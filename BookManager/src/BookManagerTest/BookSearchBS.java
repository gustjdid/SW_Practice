package BookManagerTest;

import java.util.Arrays;

public class BookSearchBS {

    private Book[] books; // 책 객체 배열

    // BookSearchBS 생성자: 주어진 책 배열을 초기화하고 ID 순서로 정렬
    public BookSearchBS(Book[] books) {
        this.books = books;
        Arrays.sort(this.books, (b1, b2) -> Integer.compare(b1.getId(), b2.getId()));
    }

    // 책의 고유 아이디를 사용하여 일반 탐색(선형 탐색)을 통해 책을 찾는 메서드
    public Book search(int targetId) {
        for (Book book : books) {
            if (book.getId() == targetId) {
                return book;
            }
        }
        return null;
    }

    // 책의 고유 아이디를 사용하여 이진 탐색을 통해 책을 찾는 메서드
    public Book search_bs(int targetId) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books[mid].getId() == targetId) {
                return books[mid];
            } else if (books[mid].getId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // 책을 찾지 못한 경우
    }
}