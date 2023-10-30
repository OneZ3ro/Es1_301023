package angelomoreno.Es1_301023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Es1301023Application {

    public static void main(String[] args) {
        SpringApplication.run(Es1301023Application.class, args);
        configurationClass();
    }

    public static void configurationClass() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Es1301023Application.class);
        System.out.println(ctx.getBean("menu"));
        ctx.close();
    }
}
