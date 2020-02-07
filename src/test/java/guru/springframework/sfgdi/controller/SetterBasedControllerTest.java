package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterInjectedController setController;

    /*Before anything happens in the program, set up is done!!!*/
    @BeforeEach
    void setUp() {
        setController = new SetterInjectedController();
        setController.setiGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setController.getGreeting());
    }
}