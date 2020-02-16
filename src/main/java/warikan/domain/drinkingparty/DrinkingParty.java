package warikan.domain.drinkingparty;

import lombok.AllArgsConstructor;
import warikan.domain.member_weights.WeightOfMember;
import warikan.domain.member_weights.WeightOfMembers;
import warikan.domain.members.Members;
import warikan.domain.payments.Payments;
import warikan.domain.weight.Weight;
import warikan.domain.weight.WeightOfPaymentKubun;
import warikan.domain.weight.WeightOfPaymentKubuns;

import java.util.List;

@AllArgsConstructor
public class DrinkingParty {
    //    private final PartyName partyName;
//    private final HoldingDateTime holdingDateTime;
    private final Members members;
    private final BillingPrice billingPrice;
    private final WeightOfPaymentKubuns weightOfPaymentKubuns;

    public static DrinkingParty set(Members members, BillingPrice billingPrice, WeightOfPaymentKubuns weightOfPaymentKubuns) {
        return new DrinkingParty(members, billingPrice,weightOfPaymentKubuns);
    }

    public Payments calculate() {
        WeightOfMembers weightOfMembers = WeightOfMembers.create(members,weightOfPaymentKubuns);
        return Payments.create(weightOfMembers,billingPrice);
    }

}
