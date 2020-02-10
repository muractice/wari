package warikan.domain.payments;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.Price;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class PaymentPricePerMember {
    @Getter
    private final Price price;

    static PaymentPricePerMember create(Price price){
        return new PaymentPricePerMember(price);
    }
}
