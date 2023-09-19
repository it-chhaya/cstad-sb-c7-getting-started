package co.istad.gettingstarted;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, welcome to Spring Boot";
    }

}
