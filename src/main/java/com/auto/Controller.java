package com.auto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping(value="/autovalue")
public String getauto() {
	return "i chitra.now you are full stack developer";
}
}
