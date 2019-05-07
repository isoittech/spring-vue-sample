package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kisokaravue")
public class VueTrainingController {
	@GetMapping("/")
	public String kisokaravue() {
		// 下記URLでアクセスする。
		// http://localhost:5000/kisokaravue/#/
		System.out.println("asda2245678987654");
		return "kisokaravue/index";
	}
}
