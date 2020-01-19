package pl.sdacademy.intermediate.basic.basic8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookStoreInitializer {

    List<Book> initBookStore() throws FileNotFoundException {


        Scanner in = new Scanner(new File("books.txt"));

        List<Book> listOfBook = new LinkedList<>();
        while (in.hasNext()) {
            String bookLine = in.nextLine();
            String[] splitBookLine = bookLine.split("\\|");
            String title = splitBookLine[0];
            String author = splitBookLine[1];
            int yearPushlished = Integer.parseInt(splitBookLine[2]);
            int numberOfPages = Integer.parseInt(splitBookLine[3]);
            double price = Double.parseDouble(splitBookLine[4]);
            Genre genre = Genre.valueOf(splitBookLine[5]);

            Book book = Book.builder()
                    .title(title)
                    .author(author)
                    .yearPushlished(yearPushlished)
                    .numberOfPages(numberOfPages)
                    .price(price)
                    .genre(genre)
                    .build();
            System.out.println(book);

            listOfBook.add(book);
        }


        return listOfBook;
    }
}
