package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PaymentKubun {
    HIGH(3),
    MIDDLE(2),
    LOW(1);

    @Getter
    private final int weight;
}
