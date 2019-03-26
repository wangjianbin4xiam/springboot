package com.example.springboot;

import com.springboot.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//@RestController
@Controller
public class SpringbootApplication {

//	@Autowired
//	HelloService helloService;
//
//	@RequestMapping("/")
//	public String index(){
//		return helloService.sayHello();
//	}

	@RequestMapping("/")
	public String index(Model model){
		Person single = new Person("aa",11);
		List<Person> people = new ArrayList<>();
		Person p1 = new Person("xx",11);
		Person p2 = new Person("ee",12);
		Person p3 = new Person("cc",13);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		model.addAttribute("singlePerson",single);
		model.addAttribute("person",people);
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
