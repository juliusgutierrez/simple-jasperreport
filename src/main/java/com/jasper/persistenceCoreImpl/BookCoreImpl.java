package com.jasper.persistenceCoreImpl;

import com.jasper.dto.BookDTO;
import com.jasper.persistenceCore.BookCore;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julius on 8/7/14.
 */
@Repository()
public class BookCoreImpl implements BookCore {


    @Override
    public List<BookDTO> getAllBook() {
        List<BookDTO> bookDTOList = new ArrayList<BookDTO>();
        String[] bookName = {"Buhay ni Rizal", "Super Book", "The Alchemist", "Ang kwento ni Pong Pagong", "Maria Makiling",
                "Dekada 70's", "ABNKKBSNPLAKo?", "Alamat ng Gubat", "Paboritong Libro ni Hudas", "Stainless Longganissa"};
        String bookRef = "book";
        BookDTO bookDTO = null;

        int x = 0;
        while(x < 10) {
            bookDTO = new BookDTO(x,bookName[x], bookRef+(x+1));
            bookDTOList.add(bookDTO);
            x++;
        }
        return bookDTOList;
    }
}
