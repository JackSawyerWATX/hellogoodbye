package com.jacksawyer.hellogoodbye;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@RestController
public class HellogoodbyeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellogoodbyeApplication.class, args);
	}
		
    @RequestMapping ("/youandi")
    public String index() {
        return "You say yes. I say no. You say stop, and I say go, go, go!";
    }
    
    @RequestMapping(value="/youandi/goodbye", method=RequestMethod.GET)
    public String goodbye() {
        return "You say goodbye...";
    }
    
    @RequestMapping("/youandi/hello") 
    	public String hello() {
    	return "and I say hello!";
    }
}