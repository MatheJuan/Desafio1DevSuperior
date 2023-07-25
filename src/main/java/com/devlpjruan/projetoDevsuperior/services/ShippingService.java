package com.devlpjruan.projetoDevsuperior.services;

import org.springframework.stereotype.Service;

import com.devlpjruan.projetoDevsuperior.models.Orders;

@Service
public class ShippingService {
	
	public double shippment(Orders order) {
		
		double basicValue = order.getBasic();
		double frete=0;
		
		if(basicValue <=100) {
			frete =20.00;
		}else if(basicValue>100 && basicValue<200) {
			frete = 12.00;
		}else if(basicValue >=200){
			frete =0;
		}
		
		return frete;	
		
	}
}
