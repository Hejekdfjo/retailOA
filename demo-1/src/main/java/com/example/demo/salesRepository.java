package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
    public interface salesRepository extends JpaRepository<sales,Integer> {

        //public List<sales> findByCustomerID(int CustomerID);
        //public List<sales> findByCustomerIDAAndDateContains(int CustomerID,String date);
    }

