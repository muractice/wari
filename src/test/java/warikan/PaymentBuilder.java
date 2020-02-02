package warikan;

import warikan.domain.*;

public class PaymentBuilder {
    public static Payment create(String memberName, PaymentKubun paymentKubun,int pricePerWeight){
        return Payment.create(new Member(new MemberName(memberName),paymentKubun),new PricePerWeight(Price.create(pricePerWeight)));
    }
}
