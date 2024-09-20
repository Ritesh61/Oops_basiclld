package libmngsys.lib;

import libmngsys.book.BookCopy;
import libmngsys.dataaccessor.DBAccess;
import libmngsys.user.Member;

import java.awt.print.Book;
import java.util.List;

public class Library {

    private final DBAccess dbAccess ;

    public Library(DBAccess dbAccess) {
        this.dbAccess = dbAccess;
    }

    public void addBookCopy(BookCopy bookCopy) {
        if(bookCopy == null){}
        dbAccess.insertBookCopy(bookCopy);
    }

    public void deleteBookCopy(BookCopy bookCopy) {
        if(dbAccess.isCopyAvailable(bookCopy))
            dbAccess.deleteBookCopy(bookCopy);
    }

    public void blockMember(Member member) {

    }

    public void issueBook(BookCopy bookCopy, Member member) {

    }

    public void submitBook(BookCopy bookCopy, Member member) {

    }

    public Member getBorrower(BookCopy bookCopy) {
        return null;
    }

    public List<BookCopy> getBorrowedBooks(Member member) {
        return null;
    }


}
