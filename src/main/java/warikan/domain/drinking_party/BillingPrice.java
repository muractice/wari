package warikan.domain.drinking_party;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.Price;

@ToString
@AllArgsConstructor
public class BillingPrice {
    @Getter
    private final Price price;

}
