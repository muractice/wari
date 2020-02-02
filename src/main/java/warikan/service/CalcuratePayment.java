package warikan.service;

import warikan.domain.*;

public class CalcuratePayment {
    public Payments calcurate(Members members, BillingPrice billingPrice){

        DrinkingParty drinkingParty = DrinkingParty.set(members, billingPrice);
        return drinkingParty.calcurate();
    }
}
