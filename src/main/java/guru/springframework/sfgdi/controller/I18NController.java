package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    /*INTERNATIONALIZATION: which starts from I and ends with N that contains 18 chars*/

    private final IGreetingService iGreetingService;


    public I18NController(@Qualifier("language") IGreetingService iGreetingService) {
        this.iGreetingService = iGreetingService;
    }

    public String sayGreeting() {
        return iGreetingService.sayGreeting();
    }
}
