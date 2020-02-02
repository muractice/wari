package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Price {
    @Getter
    private final int value;

    public static Price create(int value){
        return new Price(value);
    }

    Price devide(int number){
        return new Price(value/number);
    }

    Price multiply(int number){
        return new Price(value * number);
    }

}
