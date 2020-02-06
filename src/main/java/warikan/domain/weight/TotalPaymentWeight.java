package warikan.domain.weight;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
public class TotalPaymentWeight {
    @Getter
    private final Weight value;

    public static TotalPaymentWeight create(Weight weight){
        return new TotalPaymentWeight(weight);
    }

    public static TotalPaymentWeight create(){
        return new TotalPaymentWeight(Weight.create(0));
    }

    public TotalPaymentWeight sum(Weight weight){
        return new TotalPaymentWeight(value.sum(weight));
    }

    int getWeightValue(){
        return value.getValue();
    }

}
