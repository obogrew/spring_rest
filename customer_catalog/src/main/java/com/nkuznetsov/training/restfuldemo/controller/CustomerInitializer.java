package com.nkuznetsov.training.restfuldemo.controller;

import java.util.Date;
import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nkuznetsov.training.restfuldemo.model.Characteristic;
import com.nkuznetsov.training.restfuldemo.model.Customer;

@Component
public class CustomerInitializer implements CommandLineRunner {

	private final CustomerRepository customerRepository;
	
	public CustomerInitializer(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String... args) throws Exception {
	Customer cust = new Customer();
	
	Random rnd = new Random();
	long ms = -946771200000L + (Math.abs(rnd.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
	cust.setBirthDate(new Date(ms));
	
	cust.setFirstName("Ivan");
	
	cust.setLastName("Petrov");
	
	Characteristic ch = new Characteristic();
	ch.setCharId(new Long(1));
	ch.setCharacteristicsName("Name1");
	ch.setCharacteristicsValue("Val11");
	cust.getCharacteristics().add(ch);
	
	ch = new Characteristic();
	ch.setCharId(new Long(2));

	ch.setCharacteristicsName("Imya");
	ch.setCharacteristicsValue("Znachenie");
	cust.getCharacteristics().add(ch);
	
	customerRepository.save(cust);
	
	
		
	}

}
