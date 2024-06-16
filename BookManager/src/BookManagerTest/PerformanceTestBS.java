package BookManagerTest;

import java.util.Random;

public class PerformanceTestBS {
    public static void main(String[] args) {
        // 책 객체 배열 생성
        int numberOfBooks = 100000; // 10만개의 책 생성
        Book[] books = new Book[numberOfBooks];

        // 랜덤 책 데이터 생성
        Random random = new Random();
        for (int i = 0; i < numberOfBooks; i++) {
            books[i] = new Book(i, "Book " + i, "Author " + i, random.nextInt(1900, 2024));
        }

        // BookSearchBS 객체 생성
        BookSearchBS bookSearch = new BookSearchBS(books);

        // 테스트할 타겟 ID 설정
        int targetId = random.nextInt(numberOfBooks);

        // 선형 탐색 성능 테스트
        long startTime = System.nanoTime();
        Book result = bookSearch.search(targetId);
        long endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;
        System.out.println("Linear Search Time: " + linearSearchTime + " nanoseconds");

        // 이진 탐색 성능 테스트
        startTime = System.nanoTime();
        result = bookSearch.search_bs(targetId);
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;
        System.out.println("Binary Search Time: " + binarySearchTime + " nanoseconds");

        // 성능 비교
        if (result != null) {
            System.out.println("Book found: " + result.getTitle());
        } else {
            System.out.println("Book not found.");
        }
        System.out.println("Binary search is " + (linearSearchTime / (double) binarySearchTime) + " times faster than linear search.");
    }
}
