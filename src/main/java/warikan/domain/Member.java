package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Member {
    private final MemberName memberName;
    private final PaymentKubun paymentKubun;

    int getPaymentWeight(){
        return paymentKubun.getWeight();
    }

}
