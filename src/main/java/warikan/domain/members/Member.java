package warikan.domain.members;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Member {
    private final MemberName memberName;
    private final PaymentKubun paymentKubun;

    public int getPaymentWeight(){
        return paymentKubun.getWeight();
    }

}
