package ie.atu.demystifyingrequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


public class RequestController {

    @GetMapping("Hello")
    public String hello(){
        return "Hello, World";

    }
}

