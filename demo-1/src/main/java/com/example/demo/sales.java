package com.example.demo;

import com.example.demo.salesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name="salesTable")
public class sales {
    @Id
    @Column(name=" transanctionID")
    private int transanctionID;

    @Column(name = "transanctionAmount")
    private int transanctionAmount;

    @Column(name = "customerID")
    private  int customerID;

    @Column(name="date")
    private String date;

    public sales(){ };

    public sales(int transanctionID, int customerID,int transanctionAmount,String date){
        this.transanctionID=transanctionID;
        this.customerID=customerID;
        this.date=date;
        this.transanctionAmount=transanctionAmount;
    }

    public Integer getTransanctionID() { return transanctionID; }
    public void setTransanctionID(Integer transanctionID) { this.transanctionID = transanctionID; }

    public int getTransanctionAmount() {
        return transanctionAmount;
    }
    public void setTransanctionAmount(int transanctionAmount) {
        this.transanctionAmount = transanctionAmount;
    }

    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public List<sales> getsalesList(){
        List<sales> sales1=new ArrayList<>();
        return sales1;
    }


    //@Autowired
   // salesRepository salesrepo;
}


