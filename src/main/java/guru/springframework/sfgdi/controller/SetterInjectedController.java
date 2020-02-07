package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.IGreetingService;

public class SetterInjectedController {
    private IGreetingService iGreetingService;

    public void setiGreetingService(IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String getGreeting() {
        return iGreetingService.sayGreeting();
    }
}
