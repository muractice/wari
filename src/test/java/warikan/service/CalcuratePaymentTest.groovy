package warikan.service

import spock.lang.Specification
import spock.lang.Unroll
import warikan.PaymentBuilder
import warikan.domain.drinkingparty.BillingPrice
import warikan.domain.members.Member
import warikan.domain.members.MemberName
import warikan.domain.members.Members
import warikan.domain.members.PaymentKubun
import warikan.domain.payments.Payments
import warikan.domain.Price

@Unroll
class CalcuratePaymentTest extends Specification {
    def "test calcurate"() {
        setup:
        CalcuratePayment calcuratePayment = new CalcuratePayment();

        when:
        def result = calcuratePayment.calcurate(new Members(member), new BillingPrice(new Price(billing)))

        then:
        result == expected

        where:
        member << [
                [new Member(new MemberName("hide"), PaymentKubun.LOW)]
                ,[new Member(new MemberName("hide"), PaymentKubun.LOW)
                 , new Member(new MemberName("hige"), PaymentKubun.LOW)]
                ,[new Member(new MemberName("mura"), PaymentKubun.MIDDLE)
                  , new Member(new MemberName("hige"), PaymentKubun.HIGH)]

        ]
        billing << [10000
                    , 10000
                    ,10000]
        memberNames << [["hide"]
                        ,["hide","hige"]
                        ,["mura","hige"]]
//        paymentKubns << [[PaymentKubun.LOW]
//                        ,[PaymentKubun.LOW,PaymentKubun.LOW]
//                         ,[PaymentKubun.MIDDLE,PaymentKubun.HIGH]]
//        pricePerWeight << [10000,5000,2000]

        expected << [new Payments([PaymentBuilder.create("hide",PaymentKubun.LOW,10000)])
                     , new Payments([PaymentBuilder.create("hide", PaymentKubun.LOW, 5000)
                                        , PaymentBuilder.create("hige", PaymentKubun.LOW, 5000)])
                     , new Payments([PaymentBuilder.create("mura", PaymentKubun.MIDDLE, 2000)
                                        , PaymentBuilder.create("hige", PaymentKubun.HIGH, 2000)])
        ]

//        expected << [Payments.create([PaymentBuilder.create("hide",PaymentKubun.LOW,10000)])
//                     , Payments.create([PaymentBuilder.create("hide", PaymentKubun.LOW, 5000)
//                                        , PaymentBuilder.create("hige", PaymentKubun.LOW, 5000)])
//                     , Payments.create([PaymentBuilder.create("mura", PaymentKubun.MIDDLE, 2000)
//                                        , PaymentBuilder.create("hige", PaymentKubun.HIGH, 2000)])
//                ]

//        where:
//        memberList         | billingPrice | expected
//        ["hide","hige"] | 10000 | 5000
//        ["hide","hige","mei"] | 10000 | 3333
//        ["hide","hige","mei","tomo"] | 12000 | 3000
    }

}
