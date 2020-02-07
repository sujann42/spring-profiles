package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.IGreetingService;

public class ConstructorInjectedController {

    /*instance of the interface that the dependency is injected.*/
    private IGreetingService iGreetingService;

    /*Creating a constructor injection.*/
    public ConstructorInjectedController(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    /*Method to call the method that exists on the implementation class.*/
    public String getGreeting() {
        return iGreetingService.sayGreeting();
    }
}
