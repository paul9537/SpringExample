package com.paul9537.ex.lesson1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {

	@RequestMapping("lesson01/ex02/1")
	public String view() {
		return "lesson01/ex02/ex02";
	}
	
}
