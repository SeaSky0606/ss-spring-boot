package seasky.spring.boot.controller;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import seasky.spring.boot.bean.Greeting;
import seasky.spring.boot.model.FruitModel;

@RestController

public class GreetingController {

    private static final String template = "Hi, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/getFruits")
    public Map<String,Object> getFruits(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        return new FruitModel().getFruits();
    }

    @RequestMapping("/getFruitByTag")
    public Map<String, Object> getFruitByTag(@RequestParam(value = "tag", defaultValue = "World") String tag) {
        return new FruitModel().getFruitByTag(tag);
    }


}
