package warikan.domain.weight;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.drinking_party.*;
import warikan.domain.Price;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class PricePerWeight {
    @Getter
    private final Price price;


    static PricePerWeight create(BillingPrice billingPrice, TotalPaymentWeight totalPaymentWeight){
        return new PricePerWeight(billingPrice.getPrice().devide(totalPaymentWeight.getValue()));
    }

}
