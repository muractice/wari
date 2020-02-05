package warikan.domain.payments;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.drinkingparty.BillingPrice;
import warikan.domain.members.Members;
import warikan.domain.weight.PricePerWeight;

import java.util.List;
import java.util.stream.Collectors;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Payments {
    @Getter
    private final List<Payment> values;


    public static Payments create(Members members, BillingPrice billing) {
        PricePerWeight pricePerWeight = PricePerWeight.create(billing, members.getTotalWeight());

        return new Payments(
                members.getMembers().stream()
                        .map(m -> Payment.create(m, pricePerWeight))
                        .collect(Collectors.toList())
        );
    }


}
