package warikan.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class Members {
    @Getter
    private final List<Member> members;

    int getTotalWeight(){
        return members.stream().mapToInt(Member::getPaymentWeight).sum();
    }

}
