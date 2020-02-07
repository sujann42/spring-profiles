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


    }

}
