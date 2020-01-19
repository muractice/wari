package warikan.domain;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Members {
    private final List<Member> values;

    MembersNumber getMembersNumber(){
        return new MembersNumber(values.size());
    }

    int getTotalWeight(){
        return values.stream().mapToInt(Member::getPaymentWeight).sum();
    }

}
