package warikan.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DrinkingParty {
//    private final PartyName partyName;
//    private final HoldingDateTime holdingDateTime;
    private final Members members;
    private final Billing billing;

    public static DrinkingParty set(Members members,Billing billing){
        return new DrinkingParty(members,billing);
    }

    public Payment calcurate(){
        Price price = new Price(billing.getPrice().getValue() / members.getMembersNumber().getValue());
        return new Payment(price);
    }


}
