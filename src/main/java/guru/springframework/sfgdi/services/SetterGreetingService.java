package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/*This class implements an interface and overrides the method that exists in that interface*/
@Service
public class SetterGreetingService implements IGreetingService {

    //Overrides method from an interface.
    @Override
    public String sayGreeting() {

        return "Hello World -- Setter Injections";
    }
}
