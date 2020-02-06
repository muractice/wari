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
                new Member(new MemberName("mura"), PaymentKubun.LOW),
                new Member(new MemberName("hide"), PaymentKubun.HIGH)
        ));

        Payments payments = calcuratePayment.calcurate(new Members(memberList),new BillingPrice(new Price(10000)));

        System.out.println(payments.toString());
    }
}
