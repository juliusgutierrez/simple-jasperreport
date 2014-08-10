package com.jasper.persistenceCoreImpl;


import com.jasper.model.Book;
import com.jasper.persistenceCore.BookCore;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julius on 8/7/14.
 */
@Repository()
public class BookCoreImpl implements BookCore {

    /*
    * instead of connecting to database, just for sample purposes,
    * we'll use array as the db.
    * just image the return object is from the database. ^_____________^
    * */
    @Override
    public List<Book> getAllBook() {
        List<Book> bookList = new ArrayList<Book>();
        String[] bookName = {"Buhay ni Rizal", "Super Book", "The Alchemist", "Ang kwento ni Pong Pagong", "Maria Makiling",
                "Dekada 70's", "ABNKKBSNPLAKo?", "Alamat ng Gubat", "Paboritong Libro ni Hudas", "Stainless Longganissa"};
        String bookRef = "book";
        Book book;

        int x = 0;
        while(x < 10) {
            book = new Book();
            book.setId(x);
            book.setName(bookName[x]);
            book.setBookref(bookRef+x);
            bookList.add(book);
            x++;
        }
        return bookList;
    }
}
