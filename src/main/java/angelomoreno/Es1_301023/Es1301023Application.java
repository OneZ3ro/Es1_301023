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
        System.out.println("\n---------- PIZZE ---------- PIZZE ---------- PIZZE ---------- PIZZE ---------- PIZZE ---------- PIZZE ----------");
        System.out.println(ctx.getBean("margherita"));
        System.out.println(ctx.getBean("odiolitalia"));
        System.out.println(ctx.getBean("salume"));
        System.out.println();
        System.out.println("---------- AGGIUNTE ---------- AGGIUNTE ---------- AGGIUNTE ---------- AGGIUNTE ---------- AGGIUNTE ----------");
        System.out.println(ctx.getBean("formaggio"));
        System.out.println(ctx.getBean("prosciutto"));
        System.out.println(ctx.getBean("cipolla"));
        System.out.println(ctx.getBean("pineapple"));
        System.out.println(ctx.getBean("salami"));
        System.out.println();
        System.out.println("---------- BEVANDE ---------- BEVANDE ---------- BEVANDE ---------- BEVANDE ---------- BEVANDE ----------");
        System.out.println(ctx.getBean("limonata"));
        System.out.println(ctx.getBean("acqua"));
        System.out.println(ctx.getBean("vino"));

        ctx.close();
    }
}
