package com.jasper.core;

import com.jasper.dto.BookDTO;

import java.util.List;

/**
 * Created by Julius on 8/7/14.
 */
public interface DataSourceServiceCore {

    List<BookDTO> getReportPDF();
}
