package com.devlpjruan.projetoDevsuperior;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devlpjruan.projetoDevsuperior.models.Orders;
import com.devlpjruan.projetoDevsuperior.services.OrderService;

@SpringBootApplication
public class Projeto1DevsuperiorApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Projeto1DevsuperiorApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Orders order = new Orders(1034, 95.90, 0);
		System.out.println("O valor total é "+orderService.total(order));
		
	}

	
	
}
