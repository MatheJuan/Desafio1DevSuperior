package com.devlpjruan.projetoDevsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlpjruan.projetoDevsuperior.models.Orders;

@Service
public class OrderService {

	@Autowired
	private ShippingService shipService;

	public double total(Orders order) {

		
		double desconto = (order.getDiscount() / 100)*order.getBasic();
		double base = order.getBasic();	
		double frete = shipService.shippment(order); 
		
		double result = (base - desconto) + frete;//
		System.out.println("---Entrada---");
		System.out.println("ID="+order.getCode()+ "  || Valor Base="+order.getBasic()+" || Desconto= "+order.getDiscount());
		return result;
	}
}
