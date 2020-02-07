package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private IGreetingService iGreetingService;

    @Qualifier("setterGreetingService")
    @Autowired
    public void setiGreetingService(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String getGreeting() {
        return iGreetingService.sayGreeting();
    }
}
