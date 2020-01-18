package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Payment {
    private final Price price;

    public Price getPrice() {
        return price;
    }

    public static Payment create(Price price){
        return new Payment(price);
    }

//    public static Payment create(Members members,Billing billing){
//        return new Payment(Price.create(billing.getPrice().getValue()).devide(members.getMembersNumber().getValue()));
//    }

}
