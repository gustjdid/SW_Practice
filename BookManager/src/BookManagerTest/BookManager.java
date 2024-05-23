package BookManagerTest;

import java.util.ArrayList;
import java.util.List;


public class BookManager {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                System.out.println("해당ID(" + book.getId() + ") 는 이미 존재합니다.");
                return;
            }
        }
        books.add(book);
        System.out.println(book.toString() + "도서가 추가되었습니다.");
    }
    
    public void searchBook(String title) {
        boolean found = false;
        for (Book b : books) {
            if (b.toString().contains(title)) {
                System.out.println("검색결과:");
                System.out.println(b.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색된 도서가 없습니다.");
        }
    }

    public void removeBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                System.out.println(b.toString() +"도서를 삭제하였습니다.");
                return;
            }
        }
        System.out.println("해당 ID(" + id + ") 도서를 찾을 수 없습니다.");
    }

}

