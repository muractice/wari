package warikan.service

import spock.lang.Specification
import spock.lang.Unroll
import warikan.domain.Billing
import warikan.domain.Member
import warikan.domain.Members
import warikan.domain.Price

@Unroll
class CalcuratePaymentTest extends Specification {
    def "test calcurate"() {
        setup:
        CalcuratePayment calcuratePayment = new CalcuratePayment();
        List<Member> members = memberList.asList()

        when:
        def result = calcuratePayment.calcurate(new Members(members),new Billing(new Price(billing)))

        then:
        result.getPrice().getValue() == expected

        where:
        memberList         | billing | expected
        ["hide","hige"] | 10000 | 5000
        ["hide","hige","mei"] | 10000 | 3333
        ["hide","hige","mei","tomo"] | 12000 | 3000
    }
}
