package com.neoteric.project;

import com.neoteric.project.swiggyApplication.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwiggyService {
    @Test
    public  void Test(){
        Swiggy swiggy = new Swiggy();
        swiggy.swiggyUser = new SwiggyUser();
        swiggy.userAddress = new UserAddress();
        swiggy.restaurant = new Restaurant();
        swiggy.menu = new Menu();
        swiggy.order = new Order();
        swiggy.payment = new Payment();

        SwiggyUser swiggyUser = new SwiggyUser();
        swiggyUser.userName = "Sai";
        swiggyUser.mailId = "sai101@gmail.com";
        swiggyUser.phoneNo = 981223446;


        UserAddress userAddress = new UserAddress();
        userAddress.flatNO = "504";
        userAddress.area = "SBI-colony";
        userAddress.city = "Hyd";
        userAddress.pinCode = "500090";

        Restaurant rest = new Restaurant();
        rest.resId = "Res1234";
        rest.resName = "Peacock";
        rest.resLocation = "KPHB";
        rest.resTimings = "12:00pm-1:00am";


        Menu menu = new Menu();
        menu.itemId = "PR-102";
        menu.itemName = "Chicken-biryani";
        menu.itemPrice = 350.00;


        Order order = new Order();
        order.orderId = "PRB102";
        order.orderPrice = 370.00;
        order.noOfItems = 01;

        Payment payment = new Payment();
        payment.paymentType = "phone-pay";
        payment.paymentId = "UNB1234";

        swiggy.swiggyUser = swiggyUser;
        swiggy.userAddress = userAddress;
        swiggy.restaurant = rest;
        swiggy.menu = menu;
        swiggy.order = order;
        swiggy.payment = payment;


        Assertions.assertEquals("Chicken-biryani",menu.itemName);
        Assertions.assertNotNull(order.noOfItems);







    }
}


