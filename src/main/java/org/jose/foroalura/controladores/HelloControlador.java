package org.jose.foroalura.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControlador {
	
	 @GetMapping
	 public String sayHello(){
		 return "Hello";
	 }
	
}
