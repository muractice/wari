package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class PricePerWeight {
    @Getter
    private final Price price;

//    static PricePerWeight create(Price price){
//        return new PricePerWeight(price);
//    }

    static PricePerWeight create(BillingPrice billingPrice, TotalPaymentWeight totalPaymentWeight){
        return new PricePerWeight(billingPrice.getPrice().devide(totalPaymentWeight.getValue()));
    }

}
