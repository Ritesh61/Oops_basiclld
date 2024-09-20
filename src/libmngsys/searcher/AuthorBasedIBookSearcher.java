package libmngsys.searcher;

import libmngsys.book.BookCopy;

import java.util.List;

public class AuthorBasedIBookSearcher implements IBookSearcher {

   private final List<String> authorName;

    public AuthorBasedIBookSearcher(List<String> authorName) {
        this.authorName = authorName;
    }

    @Override
    public List<BookCopy> searchBooks() {
        return null;
    }
}
