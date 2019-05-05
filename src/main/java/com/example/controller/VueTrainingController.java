package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vuetraining")
public class VueTrainingController {
	@GetMapping("/")
	public String vuetraining() {
		// 下記URLでアクセスする。
		// http://localhost:5000/vuetraining/#/
		System.out.println("asda2245678987654");
		return "vuetraining/index";
	}
}
