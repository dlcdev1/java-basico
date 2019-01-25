package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus orderStatus;
	
	private Client client;
	private List<OrderItem> orderIten = new ArrayList<>();
	
	public Order() {
		
	}
	

	public Order(Date moment, OrderStatus orderStatus, Client client, List<entities.OrderItem> orderIten) {

		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
		this.orderIten = orderIten;
	}





	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderIten() {
		return orderIten;
	}

	

	public void addItem(OrderItem item) {
		orderIten.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderIten.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem item : orderIten) {
			sum += item.subTotal();
		}
		return sum;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment:");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(orderStatus + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for(OrderItem item : orderIten) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}
	
	
}
