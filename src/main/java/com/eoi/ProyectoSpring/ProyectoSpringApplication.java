package com.eoi.ProyectoSpring;

import com.eoi.ProyectoSpring.entities.Customer;
import com.eoi.ProyectoSpring.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class ProyectoSpringApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	public static void main(String[] args) {

		SpringApplication.run(ProyectoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Customer customer = new Customer("Pep1",
				"Lopez0","Perez0","pep1@gmail.com",
				LocalDate.of(1980, 1,2), LocalDateTime.now());
		Customer customer2 = new Customer("Pep2",
				"Lopez1","Perez2","pep2@gmail.com",
				LocalDate.of(1981, 2,5), LocalDateTime.now());
		Customer customer3 = new Customer("Pep3",
				"Lopez3","Perez3","pep3@gmail.com",
				LocalDate.of(1983, 3,6), LocalDateTime.now());

		customerRepository.save(customer);
		customerRepository.save(customer2);
		customerRepository.save(customer3);

	}
}
