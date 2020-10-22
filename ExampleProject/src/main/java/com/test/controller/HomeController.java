package com.test.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired private TestService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		
		List<HashMap> testList = service.testList();
//		//System.out.println(testList);
//		StringBuilder str = new StringBuilder();
//		str.append("<table>");
//		
//		for (int i = 0; i < testList.size(); i++) {
//			str.append("<tr>");
//			str.append("<td>"+testList.get(i).get("bio")+"</td>");	
//			str.append("<td>"+testList.get(i).get("gender")+"</td>");	
//			str.append("<td>"+testList.get(i).get("email")+"</td>");	
//			str.append("</tr>");
//		}
//		str.append("</table>");
//		model.addAttribute("str",str.toString());
		model.addAttribute("testList",testList);
		
		return "home";
	}
	
}
