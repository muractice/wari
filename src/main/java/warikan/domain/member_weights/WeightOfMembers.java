package warikan.domain.member_weights;

import lombok.AllArgsConstructor;
import lombok.Getter;
import warikan.domain.members.Member;
import warikan.domain.members.Members;
import warikan.domain.weight.TotalPaymentWeight;
import warikan.domain.weight.Weight;
import warikan.domain.weight.WeightOfPaymentKubuns;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class WeightOfMembers {
    @Getter
    private final List<WeightOfMember> values;

    public static WeightOfMembers create(Members members, WeightOfPaymentKubuns weightOfPaymentKubuns) {

        return new WeightOfMembers(
                members.getMembers().stream()
                        .map(m -> {
                            return weightOfMemberCreate(m,weightOfPaymentKubuns);
//                            return WeightOfMember.create(m, weightOfPaymentKubuns.getWeight(m.getPaymentKubun()));
                        })
                        .collect(Collectors.toList())
        );
    }

    public TotalPaymentWeight getTotalPaymentWeight(){
        return TotalPaymentWeight.create(
                values.stream().map(WeightOfMember::getWeight)
                .reduce(Weight::sum).get()
        );
    }

    public Members getMembers(){
        return Members.create(values.stream().map(WeightOfMember::getMember)
                .collect(Collectors.toList())
        );
    }


    private static WeightOfMember weightOfMemberCreate(Member member,WeightOfPaymentKubuns weightOfPaymentKubuns){
        return WeightOfMember.create(member,
                weightOfPaymentKubuns.getWeight(member.getPaymentKubun()));
    }
}
