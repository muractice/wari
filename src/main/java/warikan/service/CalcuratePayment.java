package warikan.service;

import warikan.domain.members.Members;
import warikan.domain.payments.Payments;

public class CalcuratePayment {
    public Payments calcurate(Members members, BillingPrice billingPrice){

        DrinkingParty drinkingParty = DrinkingParty.set(members, billingPrice);
        return drinkingParty.calcurate();
    }
}
