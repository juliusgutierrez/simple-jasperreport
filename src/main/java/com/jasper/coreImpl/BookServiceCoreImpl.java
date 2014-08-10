package com.jasper.coreImpl;

import com.jasper.core.DataSourceServiceCore;
import com.jasper.dto.BookDTO;
import com.jasper.model.Book;
import com.jasper.persistenceCore.BookCore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Julius on 8/7/14.
 */
@Service()
public class BookServiceCoreImpl implements DataSourceServiceCore {

    @Autowired
    private BookCore bookCore;

    /*
    * transform the book object to bookDTO
    * */
    @Override
    public List<BookDTO> getReportPDF() {
        List<Book> bookList = bookCore.getAllBook();
        List<BookDTO> bookDTOList = new ArrayList<BookDTO>();
        BookDTO bookDTO;

        for(Book book: bookList) {
            bookDTO = new BookDTO(book.getId(), book.getName(), book.getBookref());
            bookDTOList.add(bookDTO);
        }
        return bookDTOList;
    }
}
