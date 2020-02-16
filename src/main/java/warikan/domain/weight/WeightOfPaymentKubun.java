package warikan.domain.weight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import warikan.domain.members.PaymentKubun;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class WeightOfPaymentKubun {
    private final Map<PaymentKubun,Weight> map;
//    private final PaymentKubun paymentKubun;
//    @Getter
//    private final Weight weight;

    public static WeightOfPaymentKubun create(PaymentKubun paymentKubun, Weight weight){
        Map<PaymentKubun,Weight> weightOfPaymentKubun = new HashMap<>();
        weightOfPaymentKubun.put(paymentKubun,weight);
        return new WeightOfPaymentKubun(weightOfPaymentKubun);
    }

//    public Weight getWeight(PaymentKubun paymentKubun) {
//        if(this.paymentKubun == paymentKubun) {
//            return weight;
//        }
//    }
}
