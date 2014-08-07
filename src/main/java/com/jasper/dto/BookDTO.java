package com.jasper.dto;

import org.springframework.stereotype.Component;

/**
 * Created by Julius on 8/7/14.
 */
@Component
public class BookDTO {

    private long id;
    private String name;
    private String bookref;

    public BookDTO() {};
    public BookDTO(int id, String name, String bookref) {
        this.id = id;
        this.name = name;
        this.bookref = bookref;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookref() {
        return bookref;
    }

    public void setBookref(String bookref) {
        this.bookref = bookref;
    }
}
