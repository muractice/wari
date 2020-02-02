package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Payments {
    @Getter
    private final List<Payment> values;

//    public static Payments create(List<Payment> payments){
//        return new Payments(payments);
//    }

    public static Payments create(Members members, BillingPrice billing) {
        PricePerWeight pricePerWeight = PricePerWeight.create(billing, members.getTotalWeight());

        return new Payments(
                members.getMembers().stream()
                        .map(m -> Payment.create(m, pricePerWeight))
                        .collect(Collectors.toList())
        );
    }

//    private PricePerWeight calcuratePricePerWeight(BillingPrice billingPrice,)


}
