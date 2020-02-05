package warikan.domain;

import lombok.AllArgsConstructor;
import warikan.domain.members.Members;
import warikan.domain.payments.Payments;

@AllArgsConstructor
public class CalcuratePaymentsBk {
    private final Members members;
    private final BillingPrice billingPrice;

    public static CalcuratePaymentsBk create(Members members, BillingPrice billingPrice) {
        return new CalcuratePaymentsBk(members, billingPrice);
    }

    public Payments exec(){
        return Payments.create(members,billingPrice);

    }
}
