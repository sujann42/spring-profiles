package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


//@Profile({"ES", "default"})
@Profile("ES")
@Service("language")
public class I18NSpanishGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Como estas from Spanish!!!!";
    }
}
