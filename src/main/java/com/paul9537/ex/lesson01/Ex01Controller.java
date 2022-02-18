package com.paul9537.ex.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson1/ex01")
public class Ex01Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		return "hello";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Object> printMap() {
		Map<String, Object> map = new HashMap<>();

		map.put("apple", 1500);
		map.put("banana", 5000);
		map.put("orange", 1000);
		
		return map;
	}
	
	
	
	
}
