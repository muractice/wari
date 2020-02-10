package warikan.domain.drinkingparty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.Price;

@ToString
@AllArgsConstructor
public class BillingPrice {
    @Getter
    private final Price price;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString(){
        return Integer.toString(price.getValue());
    }

}
