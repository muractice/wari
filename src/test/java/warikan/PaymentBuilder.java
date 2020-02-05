package warikan;

import warikan.domain.*;
import warikan.domain.members.Member;
import warikan.domain.members.MemberName;
import warikan.domain.payments.Payment;
import warikan.domain.members.PaymentKubun;
import warikan.domain.weight.PricePerWeight;

public class PaymentBuilder {
    public static Payment create(String memberName, PaymentKubun paymentKubun, int pricePerWeight){
        return Payment.create(new Member(new MemberName(memberName),paymentKubun),new PricePerWeight(Price.create(pricePerWeight)));
    }
}
