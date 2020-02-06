package warikan.domain.weight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Weight {
    @Getter
    private final int value;

    public static Weight create(int value){
        return new Weight(value);
    }

    public Weight sum(Weight sumWeight){
        return create(value + sumWeight.getValue());
    }

}
