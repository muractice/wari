package warikan.domain.weight;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.drinkingparty.BillingPrice;
import warikan.domain.Price;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class PaymentPerWeight {
    @Getter
    private final Price price;


    public static PaymentPerWeight create(BillingPrice billingPrice, TotalPaymentWeight totalPaymentWeight){
        return new PaymentPerWeight(billingPrice.getPrice().devide(totalPaymentWeight.getWeightValue()));
    }

}
