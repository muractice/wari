package warikan.service

import spock.lang.Specification
import warikan.domain.Billing
import warikan.domain.Member
import warikan.domain.Members
import warikan.domain.Payment
import warikan.domain.Price

class CalcuratePaymentTest extends Specification {
    def "test calcurate"() {
        when:
        CalcuratePayment calcuratePayment = new CalcuratePayment();
        List<Member> members = memberList.asList()
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
