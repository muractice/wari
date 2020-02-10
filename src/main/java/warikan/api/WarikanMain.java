package warikan.api;

import org.springframework.beans.factory.annotation.Autowired;
import warikan.domain.Price;
import warikan.domain.drinkingparty.BillingPrice;
import warikan.domain.members.Member;
import warikan.domain.members.MemberName;
import warikan.domain.members.Members;
import warikan.domain.members.PaymentKubun;
import warikan.domain.payments.Payments;
import warikan.service.CalcuratePayment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarikanMain {


    public static void main(String[] args){
        CalcuratePayment calcuratePayment = new CalcuratePayment();

        List<Member> memberList = new ArrayList<>(Arrays.asList(
                Member.create(new MemberName("mura"), PaymentKubun.LOW),
                Member.create(new MemberName("hide"), PaymentKubun.HIGH)
        ));

        BillingPrice billingPrice = new BillingPrice(new Price(10000));
        Payments payments = calcuratePayment.calcurate(Members.create(memberList),billingPrice);

        System.out.println("総額:"+ billingPrice);
        payments.getValues().stream().forEach(payment -> {System.out.println(payment.getMember().getMemberName().getValue()+":"+payment.getPaymentPricePerMember().getPrice().getValue());});
    }
}
