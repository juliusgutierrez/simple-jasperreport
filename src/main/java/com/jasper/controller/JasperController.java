package com.jasper.controller;

import com.jasper.core.DataSourceServiceCore;
import com.jasper.dto.BookDTO;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Julius on 8/7/14.
 */
@Controller
public class JasperController {


    @Autowired
    DataSourceServiceCore dataSourceServiceCore;

    @RequestMapping(value = "/report", method = RequestMethod.GET)
    public ModelAndView getReport() {

        /*
         * Declare a parameterMap with a datatype Map
         * Create new HashMap and intialize if to parameterMap
         */
        Map<String, Object> parameterMap = new HashMap<String, Object>();

        /*
         * Declare a bookDTOList
         *  call the getReportPDF and cast it to List<BookDTO>
         *  then initialize it to bookDTOList
         */
        List<BookDTO> bookDTOList = dataSourceServiceCore.getReportPDF();


        /*
         * Declare a dataSource
         * create new JRBeanCollectionDataSource object and pass the bookDTOList to it.
         * initialize the datasourse to the new object
         */
        JRDataSource dataSource = new JRBeanCollectionDataSource(bookDTOList);

        /*
         * pass the datasource as value and give it a key as book
         *
         */
        parameterMap.put("book", dataSource);

        /*
         * declare and initialize a ModelAndView object
         * pass a reference value parameterMap as value and bookreport as key
         * note: bookreport key is the bean name of bookreport.jrxml in jasper-view
         */
        ModelAndView modelAndView = new ModelAndView("bookreport", parameterMap);

        /*
        * return the modelAndView to the user
        * */
        return modelAndView;

    }
}
