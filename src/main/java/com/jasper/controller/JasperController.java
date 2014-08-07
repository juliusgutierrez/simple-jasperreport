package com.jasper.controller;

import com.jasper.service.DataSourceServiceCore;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jasper.dto.BookDTO;
import java.util.*;


/**
 * Created by Julius on 8/7/14.
 */
@Controller
public class JasperController {


    @Autowired
    DataSourceServiceCore dataSourceServiceCore;


    @RequestMapping(value = "/report", method = RequestMethod.GET)
    public ModelAndView getReport() {

        Map<String, Object> parameterMap = new HashMap<String, Object>();
        List<BookDTO> bookDTOList = (List<BookDTO>) dataSourceServiceCore.getReportPDF();

        JRDataSource dataSource = new JRBeanCollectionDataSource(bookDTOList);

        parameterMap.put("book", dataSource);

        ModelAndView modelAndView = new ModelAndView("bookreport", parameterMap);
        return modelAndView;

    }
}
