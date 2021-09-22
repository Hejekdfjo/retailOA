package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//      A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.
//		A customer receives 2 points for every dollar spent over $100 in each transaction,
//		plus 1 point for every dollar spent over $50 in each transaction
//		(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).
//		Given a record of every transaction during a three month period,
//		calculate the reward points earned for each customer per month and total.
@Service
public class salesService {

    @Autowired
    private salesRepository saleRepo;

    @Autowired
    private sales sales;

    private List<sales> getSales(){
        return saleRepo.findAll();
    }


     //caltulate customer total points
     public int filteringSales(Integer customerID) {
        //check if input customerID is empty
         int cID = customerID == null ? sales.getCustomerID() : customerID;
         //filtering all the transcations by customer ID
         List<sales> ft1 = this.getSales().stream().filter(sales -> sales.getCustomerID() == cID).collect(Collectors.toList());
         //get transcation amount &create a list to put it
         List l = new ArrayList<>();
         List<Integer> l1 = ft1.stream().filter(ta -> ta.equals(sales.getTransanctionAmount())).collect(Collectors.toCollection(() -> l));
        //use loop to calaulate the points
         int p = 0;
         for (int i = 0; i <= l1.size() - 1; i++) {
             if (l1.get(i) <= 100 && l1.get(i) >= 50) {
                 p = l1.get(i) - 50;
             } else if (l1.get(i) > 100) {
                 p = 50 + (l1.get(i) - 100) * 2;
             } else if (l1.get(i) < 50) {
                 p = 0;
             }
             p++;
         }
             return p;
         }

         public int filteringSalesDouble(Integer customerID, String date){
             //check if both inputs are empty
             int cuID = customerID == null ? sales.getCustomerID() : customerID;
             String da = date == null ? sales.getDate() : date;
             //filtering all the transcations by customer ID and date
             List<sales> ft2 = this.getSales().stream().filter(sales -> sales.getCustomerID() == cuID && sales.getDate().contains(da)).collect(Collectors.toList());
             //get the each transcation amount put it in a list
             List l2 = new ArrayList<>();
             List<Integer> l3 = ft2.stream().filter(ta -> ta.equals(sales.getTransanctionAmount())).collect(Collectors.toCollection(() -> l2));
             //looping through calaulte the total points for each customer per month
             int j = 0;
             for (int i = 0; i <= l3.size() - 1; i++) {
                 if (l3.get(i) <= 100 && l3.get(i) >= 50) {
                     j = l3.get(i) - 50;
                 } else if (l3.get(i) > 100) {
                     j = 50 + (l3.get(i) - 100) * 2;
                 } else if (l3.get(i) < 50) {
                     j = 0;
                 }
                 j++;
             }
             return j;

         }





     }