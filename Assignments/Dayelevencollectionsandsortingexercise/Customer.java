package day11collectionsandsortingexercise;

public class Customer {
	
	private long customerId;
	private String customerName;
	private Integer customerTier;
	
	public Customer() {
		
	}
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getCustomerTier() {
		return customerTier;
	}
	public void setCustomerTier(Integer customerTier) {
		this.customerTier = customerTier;
	}
	public Customer(long customerId, String customerName, Integer customerTier) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerTier = customerTier;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerTier="
				+ customerTier + "]";
	}
	
	

}
