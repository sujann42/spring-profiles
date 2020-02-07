package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.PrimaryController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        /*["myController"] => name of the class with the small letter up front*/
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
