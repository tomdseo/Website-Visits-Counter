package com.tommy.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private int visits = 0;
	@RequestMapping("")
	public String index1(HttpSession session) {
		visits += 1;
		return "index.jsp";
	}
	
	@RequestMapping("/")
	public String index2(HttpSession session) {
		visits += 1;
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String coutner(HttpSession session) {
		session.setAttribute("visits", visits);
		return "counter.jsp";
	}

}
