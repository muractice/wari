package warikan.service;

import warikan.domain.*;

public class CalcuratePayment {
    public Payment calcurate(Members members, Billing billing){

        DrinkingParty drinkingParty = DrinkingParty.set(members,billing);
        return drinkingParty.calcurate();
    }
}
