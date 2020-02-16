package warikan.service;

import org.springframework.stereotype.Service;
import sun.misc.Contended;
import warikan.domain.drinkingparty.BillingPrice;
import warikan.domain.drinkingparty.DrinkingParty;
import warikan.domain.members.Members;
import warikan.domain.payments.Payments;
import warikan.domain.weight.WeightOfPaymentKubuns;

@Service
public class CalcuratePayment {
    public Payments calcurate(Members members, BillingPrice billingPrice, WeightOfPaymentKubuns weightOfPaymentKubuns){

        DrinkingParty drinkingParty = DrinkingParty.set(members, billingPrice,weightOfPaymentKubuns);
        return drinkingParty.calculate();
    }
}
