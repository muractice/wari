package warikan.domain.weight;

import lombok.AllArgsConstructor;
import warikan.domain.members.PaymentKubun;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class WeightOfPaymentKubuns {
    private final Map<PaymentKubun,Weight> map;

    public static WeightOfPaymentKubuns create(Map<PaymentKubun,Weight> map){
        return new WeightOfPaymentKubuns(map);
    }

    public static WeightOfPaymentKubun create(PaymentKubun paymentKubun, Weight weight){
        Map<PaymentKubun,Weight> weightOfPaymentKubun = new HashMap<>();
        weightOfPaymentKubun.put(paymentKubun,weight);
        return new WeightOfPaymentKubun(weightOfPaymentKubun);
    }

    public Weight getWeight(PaymentKubun paymentKubun){
        return map.get(paymentKubun);
    }


//    private final List<WeightOfPaymentKubun> values;
//
//    public static WeightOfPaymentKubuns create(List<WeightOfPaymentKubun> weightOfPaymentKubuns){
//        return new WeightOfPaymentKubuns(weightOfPaymentKubuns);
//    }

}
