package angelomoreno.Es1_301023.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Product {
    private String nome;
    private int calorie;
    private double prezzo;

    @Override
    public String toString() {
        return "nome: " + nome +
                ", calorie: " + calorie +
                ", prezzo: " + prezzo;
    }
}
