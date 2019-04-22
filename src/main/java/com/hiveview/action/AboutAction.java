package com.hiveview.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutAction {

	@RequestMapping(value="/{name}")
	public String toPage(@PathVariable String name) {
		return "about/"+name;
	}
	@RequestMapping(value="/abc/{name}")
	public String abc(@PathVariable String name) {
		return "about/"+name;
	}

	@RequestMapping(value="/test666")
	public String test666(String name) {
		System.out.println("aaa");
		return "about/"+name;
	}


}
