package warikan.domain.drinking_party;

import lombok.AllArgsConstructor;
import warikan.domain.members.Members;
import warikan.domain.payments.Payments;

@AllArgsConstructor
public class DrinkingParty {
    //    private final PartyName partyName;
//    private final HoldingDateTime holdingDateTime;
    private final Members members;
    private final BillingPrice billingPrice;

    public static DrinkingParty set(Members members, BillingPrice billingPrice) {
        return new DrinkingParty(members, billingPrice);
    }

    public Payments calcurate() {
        return Payments.create(members,billingPrice);
    }

}
