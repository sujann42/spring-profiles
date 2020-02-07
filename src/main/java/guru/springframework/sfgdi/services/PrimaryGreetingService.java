package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class PrimaryGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "This is the primary greeting: Hello from the start!!!!";
    }
}
