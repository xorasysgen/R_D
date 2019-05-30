package code.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
		
	private Integer customerId;
	private String customerName;
	private String  gender;
	private String state;
	private double balance;
	private String contact;
	
		
	public Customer(Integer customerId, String customerName, String state, double balance, String contact,String gender) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.state = state;
		this.balance = balance;
		this.contact = contact;
		this.gender=gender;
	}
	
	public Customer() {
		
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public List<Customer> getAllCustomer(){
		return new ArrayList<>(Arrays.asList(new Customer(101,"sushil kumar bhaskar","jharkhand",125689600.00,"9999439248","Male"),
				new Customer(501,"Anurag bhaskar","jharkhand",15689600.00,"9711067415","Male"),
				new Customer(101,"Rashi bhaskar","Uttrakhand",1000.00,"9999485632","Female"),
				new Customer(201,"mukesh sharma","Delhi",2689600.00,"9748596325","Male"),
				new Customer(601,"Aruna","Bangalore",1000.00,"8526485632","Female"),
				new Customer(101,"Urvashi Rathor","Uttrakhand",1000.00,"9999485632","female"),
				null,
				new Customer(101,"Vishu bhardwaj","Gurgaon",15689600.00,"9715893499","Male"),
				null,
				new Customer(0," ","Gurgaon",0.0,"0","unknown"),new Customer(0," ","Gurgaon",0.0,"0","unknown")));
		
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
				+ ", state=" + state + ", balance=" + balance + ", contact=" + contact + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	

}

