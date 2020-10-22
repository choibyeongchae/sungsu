package com.test.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@RequestMapping(value ="/list",method=RequestMethod.GET)
	public ModelAndView boardGet(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView model = new ModelAndView("board/board");
			
		return model;
		
	}
	
	@RequestMapping(value ="/boardList",method=RequestMethod.POST)
	@ResponseBody
	public HashMap boardList(@RequestBody List<HashMap> map,Model model,HttpServletRequest request,HttpServletResponse response)  {
		//List<HashMap> listMap = service.getListMap();
		StringBuilder str =  new StringBuilder();
		for (int i = 0; i < map.size(); i++) {
			str.append("<tr>");
			str.append("<td>"+map.get(i).get("name")+"</td>");
			str.append("<td>"+map.get(i).get("id")+"</td>");
			str.append("<td>"+map.get(i).get("pw")+"</td>");
			str.append("</tr>");
			
		}
		HashMap mapTest = new HashMap();
		mapTest.put("str", str.toString());
		
		
		return mapTest;
	}
}
