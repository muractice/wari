package warikan.domain.payments;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.drinkingparty.BillingPrice;
import warikan.domain.member_weights.WeightOfMembers;
import warikan.domain.members.Members;
import warikan.domain.weight.PaymentPerWeight;

import java.util.List;
import java.util.stream.Collectors;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Payments {
    @Getter
    private final List<Payment> values;


    public static Payments create(WeightOfMembers weightOfMembers, BillingPrice billing) {
        PaymentPerWeight paymentPerWeight = PaymentPerWeight.create(billing, weightOfMembers.getTotalPaymentWeight());

        return new Payments(
                weightOfMembers.getValues().stream()
                        .map(m -> Payment.create(m, paymentPerWeight))
                        .collect(Collectors.toList())
        );
    }

//    public static Payments create(Members members, BillingPrice billing) {
//        PaymentPerWeight paymentPerWeight = PaymentPerWeight.create(billing, members.getTotalWeight());
//
//        return new Payments(
//                members.getMembers().stream()
//                        .map(m -> Payment.create(m, paymentPerWeight))
//                        .collect(Collectors.toList())
//        );
//    }


}
