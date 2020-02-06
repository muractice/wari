package warikan.domain.members;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.weight.Weight;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Member {
    private final MemberName memberName;
    @Getter
    private final PaymentKubun paymentKubun;

    public Weight getPaymentWeight(){
        return paymentKubun.getWeight();
    }
    public int getPaymentWeightValue(){
        return paymentKubun.getWeight().getValue();
    }

}
