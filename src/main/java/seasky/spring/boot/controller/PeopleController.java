package seasky.spring.boot.controller;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import seasky.spring.boot.bean.Greeting;
import seasky.spring.boot.model.PeopleModel;

@RestController
@RequestMapping("/people")
public class PeopleController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template,
				name));
	}

	@RequestMapping("/getAllPeople")
	public Map<String, Object> getAllPeople(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return new PeopleModel().getAllPeople();
	}

	@RequestMapping("/getPeopleById")
	public Map<String, Object> getPeopleById(
			@RequestParam(value = "id", defaultValue = "World") int id,
			Model model) {
		return new PeopleModel().getPeopleById(id);
	}

}
