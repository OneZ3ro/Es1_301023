package angelomoreno.Es1_301023;

import angelomoreno.Es1_301023.entities.Drink;
import angelomoreno.Es1_301023.entities.Menu;
import angelomoreno.Es1_301023.entities.Pizza;
import angelomoreno.Es1_301023.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    @Scope("prototype")
    Pizza margherita() {
        List<String> ingredienti = new ArrayList<>();
        ingredienti.add("pomodoro");
        ingredienti.add("mozzarella");
        return new Pizza("margherita", 1104, 4.99, ingredienti);
    }

    @Bean
    @Scope("prototype")
    Pizza odiolitalia() {
        List<String> ingredienti = new ArrayList<>();
        ingredienti.add("pomodoro");
        ingredienti.add("mozzarella");
        ingredienti.add("prosciutto");
        ingredienti.add("ananas");
        return new Pizza("odiolitalia", 1024, 6.49, ingredienti);
    }

    @Bean
    @Scope("prototype")
    Pizza salume() {
        List<String> ingredienti = new ArrayList<>();
        ingredienti.add("pomodoro");
        ingredienti.add("mozzarella");
        ingredienti.add("salame");
        return new Pizza("salume", 1160, 5.99, ingredienti);
    }

    @Bean
    @Scope("prototype")
    Topping formaggio() {
        return new Topping("formaggio", 92, 0.69);
    }

    @Bean
    @Scope("prototype")
    Topping prosciutto() {
        return new Topping("prosciutto", 35, 0.99);
    }

    @Bean
    @Scope("prototype")
    Topping cipolla() {
        return new Topping("cipolla", 22, 0.69);
    }

    @Bean
    @Scope("prototype")
    Topping pineapple() {
        return new Topping("pineapple", 24, 0.79);
    }

    @Bean
    @Scope("prototype")
    Topping salami() {
        return new Topping("salami", 86, 0.99);
    }

    @Bean
    @Scope("prototype")
    Drink limonata() {
        return new Drink("limonata", 128, 1.29, 0.33);
    }

    @Bean
    @Scope("prototype")
    Drink acqua() {
        return new Drink("acqua", 0, 1.29, 0.5);
    }

    @Bean
    @Scope("prototype")
    Drink vino() {
        return new Drink("vino", 607, 7.49, 0.75, 13);
    }

    @Bean
    @Scope("prototype")
    Menu menu() {
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(margherita());
        pizze.add(odiolitalia());
        pizze.add(salume());

        List<Topping> aggiunte = new ArrayList<>();
        aggiunte.add(formaggio());
        aggiunte.add(prosciutto());
        aggiunte.add(cipolla());
        aggiunte.add(pineapple());
        aggiunte.add(salami());

        List<Drink> bevande = new ArrayList<>();
        bevande.add(limonata());
        bevande.add(acqua());
        bevande.add(vino());
        return new Menu(pizze, aggiunte, bevande);
    }
}
