package warikan.domain.members;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class MemberName {
    @Getter
    private final String value;

    public static MemberName create(String meberName){
        return new MemberName(meberName);
    }

}
