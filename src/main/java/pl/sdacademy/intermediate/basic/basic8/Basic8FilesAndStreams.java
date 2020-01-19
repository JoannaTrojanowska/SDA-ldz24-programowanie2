package pl.sdacademy.intermediate.basic.basic8;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Basic8FilesAndStreams {
    public static void main(String[] args) throws FileNotFoundException {


        BookStore bookStore = new BookStore();

        List<String> allAuthors = bookStore.getBookList().stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List of all authors: " + allAuthors);


        int numberOfAllSapkowskiBooks = bookStore.findBooksByAuthor("Andrzej Sapkowski").size();

        double totalCostOfSomeFantasyBooks = bookStore.findGenre(Genre.FANTASY)
                .stream()
                .filter(book -> book.getYearPushlished() >= 1990 && book.getYearPushlished() <= 1999)
                .filter(book -> BigDecimal.valueOf(book.getPrice()).compareTo(BigDecimal.valueOf(40.0)) > 0)
                .mapToDouble(Book::getPrice)
                .sum();

        List<BookShortInfo> shortInfoAboutSomeCrimeBooks = bookStore.findGenre(Genre.CRIME_STORY)
                .stream()
                .filter(book -> book.getAuthor().equals("Harlan Coben"))
                .filter(book -> book.getNumberOfPages()<=300)
                .skip(2)
                .map(book -> BookShortInfo.builder()
                .title(book.getTitle())
                .author(book.getAuthor())
                .yearPushlished(book.getYearPushlished())
                .build())
                .collect(Collectors.toList());


        System.out.println(numberOfAllSapkowskiBooks);
        System.out.println(totalCostOfSomeFantasyBooks);
        System.out.println(shortInfoAboutSomeCrimeBooks);
    }
}
