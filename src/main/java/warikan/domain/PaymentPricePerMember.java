package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class PaymentPricePerMember {
    private final Price price;

    static PaymentPricePerMember create(Price price){
        return new PaymentPricePerMember(price);
    }
}
