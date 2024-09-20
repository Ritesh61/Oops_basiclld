package libmngsys.tester;

import libmngsys.id.IDGenerator;
import libmngsys.auth.UserAuthenticator;
import libmngsys.book.BookCopy;
import libmngsys.book.BookDetails;
import libmngsys.lib.Library;
import libmngsys.searcher.*;
import libmngsys.user.Member;

import java.util.Date;
import java.util.List;

public class Tester {

    public List<BookCopy> searchBooksByBookName(String bookName) {
        if(bookName == null)
            throw new IllegalArgumentException("Book name can't be null");
        IBookSearcher iBookSearcher = new NameBasedIBookSearcher(bookName);
        return iBookSearcher.searchBooks();
    }

    public List<BookCopy> searchBooksByAuthorName(List<String> authorName) {
        if(authorName == null || authorName.size() == 0)
            throw new IllegalArgumentException("Author name can't be null or empty");
        IBookSearcher iBookSearcher = new AuthorBasedIBookSearcher(authorName);
        return iBookSearcher.searchBooks();
    }

    public List<Member> searchMembersByMemberName(String memberName, String adminToken) throws IllegalAccessException {
        //authentication & auth
        if(!UserAuthenticator.isAdmin(adminToken))
            throw new IllegalAccessException("Operation Forbidden");
        IMemberSearcher iMemberSearcher = new NameBasedMemberSearcher(memberName);
        return iMemberSearcher.search();
    }

//    public void addBook(String bookName, Date publicationDate, List<String> authors, String adminToken) throws IllegalAccessException {
//        if(!UserAuthenticator.isAdmin(adminToken))
//            throw new IllegalAccessException("Operation Forbidden");
//        BookCopy bookCopy = new BookCopy(new BookDetails(bookName, publicationDate, authors), IDGenerator.getUniqueId());
//        new Library().addBookCopy(bookCopy);
//    }
//
//    public void deleteBook(int bookCopyId, String adminToken) {
//        IBookSearcher iBookSearcher = new IdBasedBookSearcher(bookCopyId);
//        List<BookCopy> bookCopies = iBookSearcher.searchBooks();
//        if(bookCopies == null || bookCopies.size() == 0) {
//            throw new RuntimeException("No book copies retrieved for given id "+ bookCopyId);
//        }
//        new Library().deleteBookCopy(bookCopies.get(0));
//    }
//
//    public void blockMember(int memberId, String adminToken) {
//
//        IMemberSearcher iMemberSearcher = new IdBasedMemberSearcher(memberId);
//        List<Member> membeRS = iMemberSearcher.search();
//        if(membeRS == null || membeRS.size() == 0)
//            throw new RuntimeException("No members retrieved for given id "+ memberId);
//        new Library().blockMember(membeRS.get(0));
//    }
//
//    public void issueBook(int bookCopyId, int memberId, String adminToken) {
//        IBookSearcher iBookSearcher = new IdBasedBookSearcher(bookCopyId);
//        List<BookCopy> bookCopies = iBookSearcher.searchBooks();
//        if(bookCopies == null || bookCopies.size() == 0) {
//            throw new RuntimeException("No book copies retrieved for given id "+ bookCopyId);
//        }
//        IMemberSearcher iMemberSearcher = new IdBasedMemberSearcher(memberId);
//        List<Member> membeRS = iMemberSearcher.search();
//        if(membeRS == null || membeRS.size() == 0)
//            throw new RuntimeException("No members retrieved for given id "+ memberId);
//        new Library().issueBook(bookCopies.get(0), membeRS.get(0));
//    }
//
//    public void submitBook(int bookCopyId, int memberId, String adminToken) {
//        IBookSearcher iBookSearcher = new IdBasedBookSearcher(bookCopyId);
//        List<BookCopy> bookCopies = iBookSearcher.searchBooks();
//        if(bookCopies == null || bookCopies.size() == 0) {
//            throw new RuntimeException("No book copies retrieved for given id "+ bookCopyId);
//        }
//        IMemberSearcher iMemberSearcher = new IdBasedMemberSearcher(memberId);
//        List<Member> membeRS = iMemberSearcher.search();
//        if(membeRS == null || membeRS.size() == 0)
//            throw new RuntimeException("No members retrieved for given id "+ memberId);
//        new Library().submitBook(bookCopies.get(0), membeRS.get(0));
//    }
//
//    public Member getBorrowerOfBook(int bookCopyId, String adminToken) {
//        IBookSearcher iBookSearcher = new IdBasedBookSearcher(bookCopyId);
//        List<BookCopy> bookCopies = iBookSearcher.searchBooks();
//        if(bookCopies == null || bookCopies.size() == 0) {
//            throw new RuntimeException("No book copies retrieved for given id "+ bookCopyId);
//        }
//        return new Library().getBorrower(bookCopies.get(0));
//    }
//
//    public List<BookCopy> getBooksBorrowedByMember(int memberId, String adminToken) {
//        IMemberSearcher iMemberSearcher = new IdBasedMemberSearcher(memberId);
//        List<Member> membeRS = iMemberSearcher.search();
//        if(membeRS == null || membeRS.size() == 0)
//            throw new RuntimeException("No members retrieved for given id "+ memberId);
//        return new Library().getBorrowedBooks(membeRS.get(0));
//    }
}
