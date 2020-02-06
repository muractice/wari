package warikan.domain.members;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import warikan.domain.weight.Weight;

@ToString
@AllArgsConstructor
public enum PaymentKubun {
    HIGH(Weight.create(3)),
    MIDDLE(Weight.create(2)),
    LOW(Weight.create(1));

    @Getter
    private final Weight weight;
}
