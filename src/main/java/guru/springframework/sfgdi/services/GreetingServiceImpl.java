package guru.springframework.sfgdi.services;

/*This class implements an interface and overrides the method that exists in that interface*/
public class GreetingServiceImpl implements IGreetingService {

    //Overrides method from an interface.
    @Override
    public String sayGreeting() {
        return "Hello World using setter Controller!!!";
    }
}
