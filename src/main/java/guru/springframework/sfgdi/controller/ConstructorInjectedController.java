package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    /*instance of the interface that the dependency is injected.*/
    //@Autowired
    private IGreetingService iGreetingService;

    /*Creating a constructor injection.*/
    @Autowired /*This is optional here!!!*/
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    /*Method to call the method that exists on the implementation class.*/
    public String getGreeting() {
        return iGreetingService.sayGreeting();
    }
}
