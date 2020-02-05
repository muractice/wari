package warikan.domain.members;

import lombok.AllArgsConstructor;
import lombok.Getter;
import warikan.domain.weight.TotalPaymentWeight;

import java.util.List;

@AllArgsConstructor
public class Members {
    @Getter
    private final List<Member> members;

    public TotalPaymentWeight getTotalWeight() {
        return TotalPaymentWeight.create(members.stream()
                .mapToInt(Member::getPaymentWeight)
                .sum()
        );
    }
}
