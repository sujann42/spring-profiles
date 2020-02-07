package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        /*["myController"] => name of the class with the small letter up front*/

        I18NController  i18 = (I18NController) ctx.getBean("i18NController");
        System.out.println("I18 COntroller: ");
        System.out.println(i18.sayGreeting());

        PrimaryController ctrl = (PrimaryController) ctx.getBean("primaryController");

        System.out.println("Primary Bean: ");
        System.out.println(ctrl.sayHello());
        //If @Qualifier is not mentioned on the dependency injection, the primary runs all over.
        System.out.println("+++++==Property==++++");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("+++++==Setter Injection==++++");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("+++++==Constructor Injection==++++");
        ConstructorInjectedController con = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(con.getGreeting());
    }

}
