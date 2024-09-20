package libmngsys.searcher;

import libmngsys.book.BookCopy;

import java.util.List;

public class IdBasedBookSearcher implements IBookSearcher {

    private final int bookCopyId;

    public IdBasedBookSearcher(int bookCopyId) {
        this.bookCopyId = bookCopyId;
    }

    @Override
    public List<BookCopy> searchBooks() {
        return null;
    }
}
