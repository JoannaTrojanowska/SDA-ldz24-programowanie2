package pl.sdacademy.intermediate.basic.basic8;

import lombok.Getter;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;


@Getter

public class BookStore {


    private List<Book> bookList;

    public BookStore() throws FileNotFoundException {
        this.bookList = new BookStoreInitializer().initBookStore();
    }

    List<Book> findBooksByAuthor(String author) {
        return this.bookList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByTitle(String title) {
        return this.bookList.stream()
                .filter(book -> book.getAuthor().equals(title))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByYear(int year) {
        return this.bookList.stream()
                .filter(book -> book.getYearPushlished() == year)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByNumberOfPages(int numberOfPages) {
        return this.bookList.stream()
                .filter(book -> book.getNumberOfPages() == numberOfPages)
                .collect(Collectors.toList());
    }

    List<Book> findPrice(double price) {
        return this.bookList.stream()
                .filter(book -> BigDecimal.valueOf(book.getPrice()== price))
                .collect(Collectors.toList());
    }

    List<Book> findGenre(Genre genre) {
        return this.bookList.stream()
                .filter(book -> Genre.valueOf(book.getGenre().equals(genre)))
                .collect(Collectors.toList());
    }


}
