package warikan.domain.members;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public enum PaymentKubun {
    HIGH(3),
    MIDDLE(2),
    LOW(1);

    @Getter
    private final int weight;
}
