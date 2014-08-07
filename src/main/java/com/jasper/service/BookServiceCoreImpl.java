package com.jasper.service;

import com.jasper.dto.*;
import com.jasper.persistenceCore.BookCore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Julius on 8/7/14.
 */
@Service()
public class BookServiceCoreImpl implements DataSourceServiceCore {

    @Autowired
    private BookCore bookCore;

    @Override
    public List<?> getReportPDF() {
        List<BookDTO> bookDTOList = bookCore.getAllBook();
        return bookDTOList;
    }
}
