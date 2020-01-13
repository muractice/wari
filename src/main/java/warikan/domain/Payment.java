package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Payment {
    private final Price price;

    public Price getPrice() {
        return price;
    }
}
