package app;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Rest {
	
	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		return String.format("Hey, %s!", name);
	}
	
}
