package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Price {
    @Getter
    private final int value;

    Price devide(int number){
        return new Price(value/number);
    }
}
