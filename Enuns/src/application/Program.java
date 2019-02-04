package application;

import java.util.Date;

import entites.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		//usando o enum
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);	

		System.out.println(order);
		
		System.out.println("------------");
		
		
		//convertendo enuns para string
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
