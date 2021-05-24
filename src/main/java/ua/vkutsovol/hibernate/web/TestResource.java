package ua.vkutsovol.hibernate.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("search")
public class TestResource {

	@RequestMapping("/test")
	public String index() {
		return "Test SEarch";
	}

}
