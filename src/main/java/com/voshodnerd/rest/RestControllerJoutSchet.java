/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.rest;

import com.voshodnerd.entity.JOutSchet;
import com.voshodnerd.repository.JOutSchetRepository;
import static com.voshodnerd.rest.RestControllerJoutSchet.PATH;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Талалаев
 */
@RestController
@RequestMapping(path = PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class RestControllerJoutSchet {

    public static final String PATH = "/joutshet";
    public static final String ITEM_PATH = "/value";
    @Autowired
    private JOutSchetRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<JOutSchet> getUnitList() throws ParseException {

        String inputString1 = "01-09-2017";
        String inputString2 = "20-10-2017";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date inputDateBegin = dateFormat.parse(inputString1);
        Date inputDateEnd = dateFormat.parse(inputString2);
        

        List<JOutSchet> ls = repository.findByDataBetween(inputDateBegin,inputDateEnd);
        
        
        return ls;
    }

}
