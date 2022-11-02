package ua.edu.ucu.apps.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping
//	public List<Flower> hello(){
//		return List.of(
//				new Flower(12, "Green", 100),
//				new Flower(5, "Blue", 200));
//	}

}
