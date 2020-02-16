package warikan.domain.member_weights;

import lombok.AllArgsConstructor;
import lombok.Getter;
import warikan.domain.members.Member;
import warikan.domain.weight.Weight;


@AllArgsConstructor
public class WeightOfMember {
    @Getter
    private final Member member;
    @Getter
    private final Weight weight;

    public static WeightOfMember create(Member member,Weight weight){
        return new WeightOfMember(member,weight);
    }



}
