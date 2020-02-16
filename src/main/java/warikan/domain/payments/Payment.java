package warikan.domain.payments;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.member_weights.WeightOfMember;
import warikan.domain.members.Member;
import warikan.domain.weight.PaymentPerWeight;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Payment {
    @Getter
    private final WeightOfMember weightOfMember;
    @Getter
    private final PaymentPricePerMember paymentPricePerMember;

    public static Payment create(WeightOfMember weightOfMember,PaymentPerWeight paymentPerWeight){
        return new Payment(weightOfMember,PaymentPricePerMember.create(paymentPerWeight.getPrice().multiply(weightOfMember.getWeight().getValue())));
    }

    public String toString(){
        return new String(
                "MemberName:"+weightOfMember.getMember().getMemberName().getValue() +", PaymentPrice:" + paymentPricePerMember.getPrice().getValue()
        );
    }


}
