package warikan.domain.payments;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import warikan.domain.members.Member;
import warikan.domain.weight.PricePerWeight;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Payment {
    private final Member member;
    private final PaymentPricePerMember paymentPricePerMember;


    public static Payment create(Member member,PricePerWeight pricePerWeight){
        return new Payment(member,PaymentPricePerMember.create(pricePerWeight.getPrice().multiply(member.getPaymentWeight())));
    }

}
