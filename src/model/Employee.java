package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.Date;

@ManagedBean(name = "employee")
@SessionScoped
public class Employee {
	
	private String firstName;
	private String surname;
	private Date dateOfBirth;
	private String sourcepassport;
	private String destinationpassport;
	private String destinationcountry;
	private String accountnumber;
	private Double ammount;
	private long transactioncode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public EmployeeEntity getEntity() {
		EmployeeEntity enployeeentity = new EmployeeEntity();
		enployeeentity.setName(firstName);
		enployeeentity.setDateOfBirth(dateOfBirth);
		enployeeentity.setSurname(surname);
		enployeeentity.setDestinationpassport(sourcepassport);
		enployeeentity.setDestinationpassport(destinationpassport);
		enployeeentity.setDestinationcountry(destinationcountry);
		enployeeentity.setAccountnumber(accountnumber);
		enployeeentity.setAmmount(ammount);
		enployeeentity.setTransactioncode(transactioncode);
		return enployeeentity;
	}
	public String getSourcepassport() {
		return sourcepassport;
	}
	public void setSourcepassport(String sourcepassport) {
		this.sourcepassport = sourcepassport;
	}
	public String getDestinationpassport() {
		return destinationpassport;
	}
	public void setDestinationpassport(String destinationpassport) {
		this.destinationpassport = destinationpassport;
	}
	public String getDestinationcountry() {
		return destinationcountry;
	}
	public void setDestinationcountry(String destinationcountry) {
		this.destinationcountry = destinationcountry;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Double getAmmount() {
		return ammount;
	}
	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}
	public long getTransactioncode() {
		return transactioncode;
	}
	public void setTransactioncode(long transactioncode) {
		this.transactioncode = transactioncode;
	}
	
}
