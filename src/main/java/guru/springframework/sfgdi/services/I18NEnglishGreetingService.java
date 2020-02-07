package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
//@Profile({"EN", "default"})
@Service("language")
public class I18NEnglishGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from English!!!!";
    }
}
