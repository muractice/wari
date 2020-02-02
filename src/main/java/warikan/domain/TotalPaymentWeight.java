package warikan.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TotalPaymentWeight {
    private final int value;

    static TotalPaymentWeight create(int value){
        return new TotalPaymentWeight(value);
    }

}
