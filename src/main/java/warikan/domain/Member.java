package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Member {
    private final MemberName memberName;
    private final PaymentKubun paymentKubun;

    int getPaymentWeight(){
        return paymentKubun.getWeight();
    }
}
