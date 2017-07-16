package com.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import com.sun.javafx.collections.MappingChange.Map;
@Controller
public class IndexController {
	@RequestMapping("/test")
    public  String test(Model model) {
		System.out.println("进来controller");
		model.addAttribute("time",new Date());
		//返回的视图
        return "/index.jsp";
    }
}
