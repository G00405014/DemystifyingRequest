package ie.atu.demystifyingrequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

        @RestController
public class RequestController {

    @GetMapping("/Hello")
    public String hello(){
        return "Hello, World";

    }
}

