package warikan.domain.members;

import lombok.AllArgsConstructor;
import lombok.Getter;
import warikan.domain.weight.TotalPaymentWeight;
import warikan.domain.weight.Weight;

import java.util.List;
import java.util.stream.Stream;

@AllArgsConstructor
public class Members {
    @Getter
    private final List<Member> members;

    public TotalPaymentWeight getTotalWeight() {

        return TotalPaymentWeight.create(
                members.stream()
                .map(Member::getPaymentWeight)
                .reduce(Weight::sum).get()
        );
    }

    public static Members create(List<Member> members){
        return new Members(members);
    }
}
