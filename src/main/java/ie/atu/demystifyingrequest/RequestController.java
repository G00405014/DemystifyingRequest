package ie.atu.demystifyingrequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

        @RestController
public class RequestController {

    @GetMapping("/Hello")
    public String hello(){
        return "Hello, World";
    }

    @GetMapping("/greet/{name}")
            public String name(@PathVariable String  name){
        return "Hello "+ name;
    }
}

