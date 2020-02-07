package guru.springframework.sfgdi.services;

public class I18NEnglishGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from English!!!!";
    }
}
