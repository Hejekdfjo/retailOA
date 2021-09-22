package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		salesService s1=new salesService();
		System.out.println(s1.filteringSales(13));
        System.out.println(s1.filteringSalesDouble(13,"2021-07"));

	}

}
