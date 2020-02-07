package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("langauge")
public class I18NSpanishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {

        return "Hola, como estas!!!";
    }
}
