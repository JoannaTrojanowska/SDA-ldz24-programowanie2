package pl.sdacademy.intermediate.basic.basic8;

import lombok.Builder;

@Builder

public class BookShortInfo {


    String title;
    String author;
    int yearPushlished;

    public BookShortInfo(String title, String author, int yearPushlished) {
        this.title = title;
        this.author = author;
        this.yearPushlished = yearPushlished;
    }
}
