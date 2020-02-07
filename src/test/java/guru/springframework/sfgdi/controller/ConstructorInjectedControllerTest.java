package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {


    ConstructorInjectedController cont;

    /*Before anything happens in the program, set up is done!!!*/
    @BeforeEach
    void setUp() {
        cont = new ConstructorInjectedController(new ConstructorGreetingService());

    }

    /*After anything happens in the program, set up is done!!!*/
    @AfterEach
    void tearDown() {
        System.out.println("Done!!!!");
    }
    /*Calling out the getGreeting() to test the functionality of the setter injection controller*/
    @Test
    void getGreeting() {
        System.out.println(cont.getGreeting());
    }
}