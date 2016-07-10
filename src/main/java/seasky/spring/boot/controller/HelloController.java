package seasky.spring.boot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		System.out.println(model);
		model.addAttribute("ret", "hello world");
		return "hello";
	}

	@RequestMapping("/save")
	public String save(
			@RequestParam(required = true, name = "name") String test, int age,
			Model model) {
		System.out.println(model);
		return "save";
	}

}
