package com.jasper.model;

/**
 * Created by Julius on 8/10/14.
 */
public class Book {

    private long id;
    private String name;
    private String bookref;

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
