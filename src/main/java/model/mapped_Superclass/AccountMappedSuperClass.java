package model.mapped_Superclass;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class AccountMappedSuperClass  implements Serializable {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String owner;
  
  private double balance;
  
  private double interestRate;
  
  
  public Long getId() {
	return id;
  }
  
  public void setId(Long id) {
	this.id = id;
  }
  
  public String getOwner() {
	return owner;
  }
  
  public void setOwner(String owner) {
	this.owner = owner;
  }
  
  public double getBalance() {
	return balance;
  }
  
  public void setBalance(double balance) {
	this.balance = balance;
  }
  
  public double getInterestRate() {
	return interestRate;
  }
  
  public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
  }
  
  @Override
  public String toString() {
	return "Account{" +
			"id=" + id +
			", owner='" + owner + '\'' +
			", balance=" + balance +
			", interestRate=" + interestRate +
			'}';
  }
}
