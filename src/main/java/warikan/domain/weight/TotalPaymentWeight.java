package warikan.domain.weight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class TotalPaymentWeight {
    @Getter
    private final int value;

    public static TotalPaymentWeight create(int value){
        return new TotalPaymentWeight(value);
    }

}
