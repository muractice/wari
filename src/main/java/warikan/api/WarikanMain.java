package warikan.api;

import org.springframework.beans.factory.annotation.Autowired;
import warikan.domain.Price;
import warikan.domain.drinkingparty.BillingPrice;
import warikan.domain.members.Member;
import warikan.domain.members.MemberName;
import warikan.domain.members.Members;
import warikan.domain.members.PaymentKubun;
import warikan.domain.payments.Payment;
import warikan.domain.payments.Payments;
import warikan.domain.weight.Weight;
import warikan.domain.weight.WeightOfPaymentKubun;
import warikan.domain.weight.WeightOfPaymentKubuns;
import warikan.service.CalcuratePayment;

import java.util.*;

public class WarikanMain {


    public static void main(String[] args){
        CalcuratePayment calcuratePayment = new CalcuratePayment();

        List<Member> memberList = new ArrayList<>(Arrays.asList(
                Member.create(MemberName.create("mura"), PaymentKubun.LOW),
                Member.create(MemberName.create("hide"), PaymentKubun.MIDDLE),
                Member.create(MemberName.create("hige"), PaymentKubun.HIGH)
        ));

        BillingPrice billingPrice = BillingPrice.create(Price.create(12000));

//        List<WeightOfPaymentKubun> weightOfPaymentKubuns = new ArrayList<>(Arrays.asList(
//                WeightOfPaymentKubun.create(PaymentKubun.LOW,Weight.create(3)),
//                WeightOfPaymentKubun.create(PaymentKubun.MIDDLE,Weight.create(4)),
//                WeightOfPaymentKubun.create(PaymentKubun.HIGH,Weight.create(5))
//        ));

        Map<PaymentKubun,Weight> tmpWeightOfPaymentKubuns = new HashMap<>();
        tmpWeightOfPaymentKubuns.put(PaymentKubun.LOW,Weight.create(3));
        tmpWeightOfPaymentKubuns.put(PaymentKubun.MIDDLE,Weight.create(4));
        tmpWeightOfPaymentKubuns.put(PaymentKubun.HIGH,Weight.create(5));

        Payments payments = calcuratePayment.calcurate(
                Members.create(memberList),billingPrice, WeightOfPaymentKubuns.create(tmpWeightOfPaymentKubuns)
        );

        System.out.println("総額:"+ billingPrice);
        payments.getValues().stream().forEach(System.out::println);
//        payments.getValues().stream().forEach(payment -> {System.out.println(payment.toString());});
//        payments.getValues().stream().forEach(payment -> {System.out.println(payment.getMember().getMemberName().getValue()+":"+payment.getPaymentPricePerMember().getPrice().getValue());});
    }
}
