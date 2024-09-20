package libmngsys.searcher;

import libmngsys.book.BookCopy;

import java.awt.print.Book;
import java.util.List;

public interface IBookSearcher {

    List<BookCopy> searchBooks();
}
