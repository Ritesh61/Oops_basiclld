package libmngsys.searcher;

import libmngsys.book.BookCopy;

import java.util.List;

public class NameBasedIBookSearcher implements IBookSearcher {

    private final String bookName;

    public NameBasedIBookSearcher(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public List<BookCopy> searchBooks() {
        return null;
    }
}
