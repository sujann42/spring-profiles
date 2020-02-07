package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {

    private final PrimaryGreetingService primaryGreetingService;

    public PrimaryController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }


    public String sayHello() {
        return "Hi, from primary bean!!!";
    }
}
