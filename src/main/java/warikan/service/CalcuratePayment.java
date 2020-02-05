package warikan.service;

import warikan.domain.drinkingparty.BillingPrice;
import warikan.domain.drinkingparty.DrinkingParty;
import warikan.domain.members.Members;
import warikan.domain.payments.Payments;

public class CalcuratePayment {
    public Payments calcurate(Members members, BillingPrice billingPrice){

        DrinkingParty drinkingParty = DrinkingParty.set(members, billingPrice);
        return drinkingParty.calculate();
    }
}
