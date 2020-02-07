package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public IGreetingService iGreetingService;

    public String getGreeting() {
        return iGreetingService.sayGreeting();
    }
}
