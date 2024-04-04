package day11collectionsandsortingexercise;

import java.time.LocalDate;
import java.util.List;

public class Order {
	
	private long orderId;
	private String orderStatus;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Product> products;
	private long customerId;
	
	public Order() {
		
	}
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public Order(long orderId, LocalDate deliveryDate, LocalDate orderDate, String orderStatus,
			long customerId) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		
		this.customerId = customerId;
	}


//		public Order(long l, LocalDate of, LocalDate of2, String string, long m) {
//		
//	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus + ", orderDate=" + orderDate
				+ ", deliveryDate=" + deliveryDate + ", products=" + products + ", customerId=" + customerId + "]";
	}
	
	
	


}
