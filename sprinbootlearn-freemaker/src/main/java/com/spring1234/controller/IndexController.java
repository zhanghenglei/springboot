package com.spring1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @ProjectName: sprinbootlearn
 * @Package: com.spring1234.controller
 * @ClassName: IndexController
 * @Author: zhanghenglei
 * @Description: index controller
 * @Date: 22/10/2018 18:16
 * @Version: 1.0
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/", "/index"})
    public ModelAndView index(Map<String, Object> map) {
        ModelAndView view = new ModelAndView();
        view.addObject("name", "SpringBoot");
        view.addObject("sex", "man");
        view.setViewName("index");
        return view;
    }
}