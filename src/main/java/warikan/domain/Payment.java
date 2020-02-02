package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Payment {
    private final Member member;
    private final PaymentPricePerMember paymentPricePerMember;

//    public static Payment create(Member member,PaymentPricePerMember paymentPricePerMember){
//        return new Payment(member,paymentPricePerMember);
//    }

    public static Payment create(Member member,PricePerWeight pricePerWeight){
        return new Payment(member,PaymentPricePerMember.create(pricePerWeight.getPrice().multiply(member.getPaymentWeight())));
    }

}
